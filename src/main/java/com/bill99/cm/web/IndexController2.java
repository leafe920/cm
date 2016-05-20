package com.bill99.cm.web;

//import javax.inject.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bill99.cm.web.login.UserForm;

@Controller("management1.indexController")
public class IndexController2 extends BaseController{


	@RequestMapping("/aaa")
	 public void runLogin(@ModelAttribute UserForm form) throws Exception {  
        System.out.println(form.getUserName());  
        System.out.println(form.getUserPwd());  
    }  
}