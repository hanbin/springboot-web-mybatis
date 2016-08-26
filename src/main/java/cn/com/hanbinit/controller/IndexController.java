package cn.com.hanbinit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页跳转
 * @author icer
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
}
