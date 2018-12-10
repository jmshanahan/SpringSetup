package biz.jshanahan.spring.basics.Springin5steps.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import biz.jshanahan.spring.basics.Springin5steps.SpringIn5StepsBasicApplication;

@RunWith(MockitoJUnitRunner.class)
public class SomeCDIBusinessTest {

	@InjectMocks
	SomeCdiBusiness business;
	
	//Create Mock
	@Mock
	SomeCDIDao daoMock;
	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		assertEquals(4,business.findGreatest() );
		
	}
	@Test
	public void testBasicNoElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE,business.findGreatest() );
	}
	@Test
	public void testBasicEqualElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {5,5});
		assertEquals(5,business.findGreatest() );
	}
}
