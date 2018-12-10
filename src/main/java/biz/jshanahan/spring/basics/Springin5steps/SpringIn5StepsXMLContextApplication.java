package biz.jshanahan.spring.basics.Springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import biz.jshanahan.spring.basics.Springin5steps.xml.XmlPersonDAO;


public class SpringIn5StepsXMLContextApplication {
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
		LOGGER.info("Beans Loaded -> {} {}",(Object)applicationContext.getBeanDefinitionNames());
		XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
		
		LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());
		
		
//		int result = binarySearch.binarySearch(new int[] {12,4,6},3);
//		System.out.println(result);
		applicationContext.close();
	}
}
