package com.saraya.form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@Autowired
	UserValidation uservalidation;
	
	@RequestMapping(value="/log", method=RequestMethod.GET)
	public String fstApp() {
		return "login";
		}
		@RequestMapping(value="/log",method=RequestMethod.POST)
		public String home(@RequestParam String username,
				@RequestParam String password, ModelMap model) {
			model.put("username", username);
			model.put("password", password);
			return "homepage";
			}
}
