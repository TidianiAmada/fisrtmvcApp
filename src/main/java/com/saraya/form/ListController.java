package com.saraya.form;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("username")
public class ListController {

	@Autowired
	TodoService todoservice;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String fstApp(ModelMap model) {
		String username=(String) model.get("username");
		List<Todo> todos = todoservice.retrieveAll(username);
		model.addAttribute("todos", todos);
		return "listpage";
	}
	
	@RequestMapping(value="/addlist", method=RequestMethod.POST)
	public String addtoTDL(@RequestParam String name,@RequestParam String desc,ModelMap model) {
		int id= 99;
		boolean isDone=false;
		String username=(String) model.get("username");
		todoservice.addTodo(id, name, desc, new Date(), isDone);
		return "redirect:/list";
	}
	
	@RequestMapping(value="/droplist", method=RequestMethod.GET)
	public String deletefromTDL(@RequestParam int id, ModelMap model) {
		todoservice.deleteTodo(id);
		model.clear();
		return "redirect:/list";
	}
	
	
	
}
