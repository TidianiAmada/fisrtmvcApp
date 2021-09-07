package com.saraya.form;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class addupController {
	
	@Autowired
	TodoService todoservice;
	
	@RequestMapping(value = "/updateForm", method = RequestMethod.GET)
	public String showUpdateForm(@RequestParam String desc,ModelMap model,@RequestParam int id) {
		model.addAttribute("todo",todoservice.findById(id));
		model.addAttribute("previous_id", id);
		return "addTDLextention";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String showadd(@Valid @ModelAttribute("todo") Todo todo,  ModelMap model,@RequestParam String desc,@RequestParam int previous_id) {
		
		
//		if(result.hasErrors()) {
//			return "/updateForm";
//		}
		
		todoservice.update(todo,previous_id,desc);
		model.clear();
		return "redirect:/list";
	}
	
//	@RequestMapping(value="/updateList", method=RequestMethod.POST)
//	public String deletefromTDL(@RequestParam int id,@RequestParam String desc, ModelMap model) {
//		String name= (String) model.get("username");
//		todoservice.update(todo);
//		model.clear();
//		return "redirect:/list";
//	}

}
