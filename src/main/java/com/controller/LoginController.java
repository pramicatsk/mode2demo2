package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class LoginController {
	
	@GetMapping(value="/login")
	public String loginPage(Model  model)
	{
		User user=new User();
		model.addAttribute("userinfo",user);
		return"validation";
	}
	
	@PostMapping(value="submiturl")
	public String submitpage(@Valid @ModelAttribute ("userinfo")User user,BindingResult result, Model model)
	{
		/*ModelAndView andView=new ModelAndView("allthebest");
		return  andView;*/
		
		String returnPage="alltheBest";
		if(result.hasErrors())
		{
			returnPage="validation";
		}
		
		return returnPage;
	}

}
