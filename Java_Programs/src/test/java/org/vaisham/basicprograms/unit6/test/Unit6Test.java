package org.vaisham.basicprograms.unit6.test;

import org.junit.Assert;
import org.junit.Test;
import org.vaisham.basicprograms.unit6.Unit6;



public class Unit6Test {
	Unit6 unit6 = new Unit6();
	
	@Test
	public void returnSumOfDigits1() {
		Assert.assertEquals(6, unit6.returnSumOfDigits(123));
	}
	@Test
	public void returnSumOfDigits2() {
		Assert.assertEquals(0, unit6.returnSumOfDigits(0));
	}
	@Test
	public void returnSumOfDigits3() {
		Assert.assertEquals(1, unit6.returnSumOfDigits(-1));
	}
	@Test
	public void returnSumOfDigits4() {
		Assert.assertEquals(6, unit6.returnSumOfDigits(-123));
	}
	@Test
	public void returnSumOfDigits5() {
		Assert.assertEquals(10, unit6.returnSumOfDigits(1090));
	}
	@Test
	public void returnSumOfDigits6() {
		Assert.assertEquals(27, unit6.returnSumOfDigits(999));
	}
	
	@Test
	public void reverseAndReturn1() {
		Assert.assertEquals(321, unit6.reverseAndReturn(123));
	}
	@Test
	public void reverseAndReturn2() {
		Assert.assertEquals(654321, unit6.reverseAndReturn(123456));
	}
	@Test
	public void reverseAndReturn3() {
		Assert.assertEquals(0, unit6.reverseAndReturn(0));
	}
	@Test
	public void reverseAndReturn4() {
		Assert.assertEquals(1, unit6.reverseAndReturn(-1));
	}
	@Test
	public void reverseAndReturn5() {
		Assert.assertEquals(1, unit6.reverseAndReturn(-100));
	}
	@Test
	public void reverseAndReturn6() {
		Assert.assertEquals(201, unit6.reverseAndReturn(-102));
	}
	
	@Test
	public void isDivisibleBy111() {
		int number = 1234;
		Assert.assertEquals(false,unit6.isDivisibleBy11(number));
	}
	@Test
	public void isDivisibleBy112() {
		int number = 12345;
		Assert.assertEquals(false,unit6.isDivisibleBy11(number));
	}
	@Test
	public void isDivisibleBy113() {
		int number = 11;
		Assert.assertEquals(true,unit6.isDivisibleBy11(number));
	}
	@Test
	public void isDivisibleBy114() {
		int number = 9;
		Assert.assertEquals(false,unit6.isDivisibleBy11(number));
	}
	@Test
	public void isDivisibleBy115() {
		int number = 0;
		Assert.assertEquals(false,unit6.isDivisibleBy11(number));
	}
	@Test
	public void isDivisibleBy116() {
		int number = 918082;
		Assert.assertEquals(true,unit6.isDivisibleBy11(number));
	}	
	@Test
	public void canFormATriangle1() {
		Assert.assertEquals(true, unit6.canFormATriangle(1, 1, 1));
	}
	@Test
	public void canFormATriangle2() {
		Assert.assertEquals(false, unit6.canFormATriangle(1, 2, 3));
	}
	@Test
	public void canFormATriangle3() {
		Assert.assertEquals(false, unit6.canFormATriangle(-1, 2, 3));
	}
	@Test
	public void canFormATriangle4() {
		Assert.assertEquals(false, unit6.canFormATriangle(0, 2, 3));
	}
}
