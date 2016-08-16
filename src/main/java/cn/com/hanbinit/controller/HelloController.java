package cn.com.hanbinit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

/**
 * @author icer
 *
 */
@RestController
@ApiIgnore
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello, 你好...";
	}
}
