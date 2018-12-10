package biz.jshanahan.spring.basics.Springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class SomeCdiBusiness {

	@Inject
	SomeCDIDao someCDIDao;
	

	

	public SomeCDIDao getSomeCDID() {
		return someCDIDao;
	}

	public void setSomeCDID(SomeCDIDao someCDID) {
		this.someCDIDao = someCDID;
	}
	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = someCDIDao.getData();
		for(int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;	
	}

}
