package com.github.lxgang.spring.i18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class I18nController {
	
	@RequestMapping(value="/")
	public ModelAndView sayHello(){
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("message", "com.github.text");
		return modelAndView;
	}
}
