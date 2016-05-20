package com.bill99.cm.web.login;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bill99.cm.web.BaseController;

/**
 * 登录页面控制器
 * @author leafe.qian
 * @date 2016年5月19日 下午10:19:16
 */
@Controller("cm.web.logonController")
@RequestMapping("/logon")
public class LogonController extends BaseController {

	private static final String LOGON_INDEX_VIEW = "login";
	private static final String MAIN_INDEX_VIEW = "main";

	@RequestMapping(value = "")
	public ModelAndView index(Model model) {
		return new ModelAndView(LOGON_INDEX_VIEW);
	}

	/**
	 * 进行登录
	 * @param model
	 * @return
	 */
	@RequestMapping("/main")
	public ModelAndView login(Model model) {
		model.addAttribute("now", new Date());

		return new ModelAndView(MAIN_INDEX_VIEW);
	}
}