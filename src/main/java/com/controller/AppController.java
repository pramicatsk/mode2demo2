package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.model.User;
import com.service.UserService;

@Controller
public class AppController {
	
	@Autowired
	private UserService userService;
	
	/*@RequestMapping (value="/url1", method= RequestMethod.GET)
	public String first()
	{
		return "/success";
	}
	
	@RequestMapping(value="/url2", method= RequestMethod.POST)
	public ModelAndView second(@ModelAttribute User user)
	{
		
		
		ModelAndView modelAndView =  new ModelAndView("emp");
		Employee employee=new Employee(10,"resh");
		model.addAttribute("key", employee);
		model.addAttribute("key2",user);
		return modelAndView;
	}
	
	@GetMapping(value="/url")
	//@PostMapping(value="/url")
	public String third()
	{
		return "/success";
	}*/
	
	@RequestMapping(value="/url3", method= RequestMethod.POST)
	public ModelAndView fourth(@ModelAttribute User user)
	{
		User obj= userService.readUserById(user.getUserId());
		
		ModelAndView modelAndView =  new ModelAndView("emp");
	   modelAndView.addObject("abc",obj);
		return modelAndView;
	}
	
	@GetMapping(value="/url4/{alias}")
	//@PostMapping(value="/url")
	public String fifth(@PathVariable("alias") int age)
	{
		System.out.println("my age is :  "+ age );
		return "/success";
	}

}

