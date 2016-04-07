package com.testing.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test2Controller 
{
	@RequestMapping("goTest2")
	public ModelAndView redirect()
	{
		ModelAndView MV = new ModelAndView();
		MV.setViewName("Test2");
		MV.addObject("mensaje", "Chau, vengo del controller Test2");
		return MV;
	}
}
