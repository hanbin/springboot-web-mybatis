package cn.com.hanbinit.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class GreetingController {

	private String greeting = "hi, how are you ?";
	
	@RequestMapping("/greeting")
	public String greeting(Map<String, Object> model){
		model.put("time", new Date());
		model.put("message", this.greeting);
		return "greeting";
	} 
}
