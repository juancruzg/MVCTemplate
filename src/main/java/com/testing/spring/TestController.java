package com.testing.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController 
{
	@RequestMapping("goTest")
	public ModelAndView redirect()
	{
		ModelAndView MV = new ModelAndView();
		MV.setViewName("Test");
		MV.addObject("mensaje", "Hola, vengo del controller Test");
		return MV;
	}
}
