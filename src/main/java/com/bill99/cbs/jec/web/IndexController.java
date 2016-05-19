package com.bill99.cbs.jec.web;

//import javax.inject.Inject;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("management.indexController")
@RequestMapping("/login")
public class IndexController extends BaseController{

	@RequestMapping("")
	public ModelAndView index(Model model) {

		model.addAttribute("now", new Date());
		
		return new ModelAndView("index");
	}

	@RequestMapping("/layout")
	public ModelAndView login(Model model) {

		model.addAttribute("now", new Date());
		
		return new ModelAndView("index_layout");
	}
}