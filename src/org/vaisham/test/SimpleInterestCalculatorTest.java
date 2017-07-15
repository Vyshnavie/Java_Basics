package org.vaisham.test;

import org.junit.Test;
import org.vaisham.basics.ISimpleInterestCalculator;
import org.vaisham.basics.SimpleInterestCalculator;

import org.junit.Assert;

public class SimpleInterestCalculatorTest {
	
	
	@Test
	public void TestArea() {
		 ISimpleInterestCalculator SimpleInterest = new SimpleInterestCalculator();
		 Assert.assertEquals(10, SimpleInterest.calculate(10, 10, 10),0.0f);
	}

}
