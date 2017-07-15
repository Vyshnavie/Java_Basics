package org.vaisham.test;

import org.junit.Test;
import org.vaisham.basics.ISumToNNumbers;
import org.vaisham.basics.SumToNNumbers;

import org.junit.Assert;

public class SumToNNumbersTest {

	
	@Test
	public void TestArea() {
		ISumToNNumbers SumtoNNumbers = new SumToNNumbers();
		//Assert.assertEquals(55, SumtoNNumbers.FindSumToNNumbers(10));
			// I learned about extend and implement.
		//Extend- child/sub class extending towards the base class(Inheritance)
		// Implements- Interface is implemented
		//Assert.assertEquals(6, SumtoNNumbers.FindSumToNNumbers2(3));
		Assert.assertEquals(55, SumtoNNumbers.FindSumToNNumbers3(10));
	}
}
