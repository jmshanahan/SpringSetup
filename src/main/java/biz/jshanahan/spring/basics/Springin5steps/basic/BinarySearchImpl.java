package biz.jshanahan.spring.basics.Springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//SortAlgorithm is a dependency
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	


	public int binarySearch(int[] numbers, int numberToSearchFor) {
//		BubbleSortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}
//	@PostConstruct
//	public void postConstruct() {
//		logger.info("postConstruct");
//	}
//	@PreDestroy
//	public void preDestroy() {
//		logger.info("preDestroy");
//	}
//	//Sorting the array
	//Search the array
	//Return the result

//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}
	

}
