package org.vaisham.test;

import org.junit.Test;
import org.vaisham.basics.IMaxOFThreeNumbers;
import org.vaisham.basics.MaxOFThreeNumbers;

//import junit.framework.Assert;//using junit.framework is giving me the strikethorugh for the assert equals so
import org.junit.Assert;
public class MaxOFThreeNumbersTest {

	//@SuppressWarnings("deprecation")//this added to suppress the awrnings
	@Test
	public void TestArea() {
		IMaxOFThreeNumbers  MaxOFThreeNumbers = new MaxOFThreeNumbers();
		//Assert.assertEquals(30, MaxOFThreeNumbers.maxOfThreeNumbers(10, 20, 30));
		Assert.assertEquals(30, MaxOFThreeNumbers.ternaryMaxOFThreeNumbers(10, 20, 30));
		
	}
}
