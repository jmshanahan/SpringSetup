package biz.jshanahan.spring.basics.Springin5steps;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import biz.jshanahan.spring.basics.Springin5steps.basic.BinarySearchImpl;
import biz.jshanahan.spring.basics.Springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan("biz.jshanahan.spring.basics.Springin5steps")
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class);
		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		System.out.println(service.returnServiceURL());
		

		applicationContext.close();
	}
}
