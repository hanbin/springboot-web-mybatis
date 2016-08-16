package cn.com.hanbinit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 使用Swagger2生成对应的api文档
 * @author icer
 *
 */
@Configuration
@EnableSwagger2 // 启用swagger2
public class Swagger2 {

	@Bean
	public Docket createRestApi(){
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("cn.com.hanbinit.controller"))
				.paths(PathSelectors.any())
				.build();
	}
	private ApiInfo apiInfo(){
		return new ApiInfoBuilder()
				.title("iblog api document")
				.description("the document for iblog")
				.contact("icer")
				.termsOfServiceUrl("http://hanbinit.com.cn")
				.version("1.0")
				.build();
	}
}
