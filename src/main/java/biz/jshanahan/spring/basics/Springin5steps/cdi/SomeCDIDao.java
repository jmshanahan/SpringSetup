package biz.jshanahan.spring.basics.Springin5steps.cdi;

import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named
public class SomeCDIDao {
	public int[] getData() {
		return new int[] {5,89,100};
	}
}
