package org.vaisham.test;

import org.junit.Assert;
import org.junit.Test;
import org.vaisham.basics.IIncrementDecrement;
import org.vaisham.basics.IncrementDecrement;


public class IncrementDecrementTest {
	@Test
	public void testArea() {
		IIncrementDecrement IncrementDecrement = new IncrementDecrement();
		//IncrementDecrement.singleDecrement(10);
		//Assert.assertEquals(11,IncrementDecrement.singleIncrement(10));
		//Assert.assertEquals(1,IncrementDecrement.singleIncrement(0));
	//Assert.assertEquals(0,IncrementDecrement.singleIncrement(-1));
//	Assert.assertEquals(12,IncrementDecrement.doubleIncrement(10));
	//Assert.assertEquals(2,IncrementDecrement.doubleIncrement(0));
	//Assert.assertEquals(1,IncrementDecrement.doubleIncrement(-1));
		//Assert.assertEquals(10,IncrementDecrement.singleDecrement(11));
		//Assert.assertEquals(-1,IncrementDecrement.singleDecrement(0));
	//Assert.assertEquals(-2,IncrementDecrement.singleDecrement(-1));
		/*Assert.assertEquals(8,IncrementDecrement.doubltDecrement(10));
		Assert.assertEquals(-2,IncrementDecrement.doubltDecrement(0));
		Assert.assertEquals(-4,IncrementDecrement.doubltDecrement(-2));*/
	//	Assert.assertEquals(10,IncrementDecrement.Increment(5));
		Assert.assertEquals(0, IncrementDecrement.Decrement(5));
	}
	
}
