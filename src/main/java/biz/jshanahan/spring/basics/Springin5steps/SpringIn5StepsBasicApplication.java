package biz.jshanahan.spring.basics.Springin5steps;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import biz.jshanahan.spring.basics.Springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("biz.jshanahan.spring.basics.Springin5steps")
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		
		int result = binarySearch.binarySearch(new int[] {12,4,6},3);
		System.out.println(result);
		applicationContext.close();
	}
}
