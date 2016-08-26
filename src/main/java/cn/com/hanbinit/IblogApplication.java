package cn.com.hanbinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动类
 * 通常我们会在应用主类中做一些框架配置扫描等配置
 * @author icer
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
public class IblogApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(IblogApplication.class, args);
	}
}
