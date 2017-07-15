package org.vaisham.test;

import org.junit.Test;
import org.vaisham.basics.ISquare;
import org.vaisham.basics.Square;
import org.junit.Assert;

public class SquareTest {
	
	@Test
	public void testArea() {
		ISquare square = new Square();
		square.setSide(4);
		Assert.assertEquals(16, square.getArea());
	}
	
	@Test
	public void testArea2() {
		ISquare square = new Square();
		square.setSide(10);
		Assert.assertEquals(100, square.getArea());
		square.setSide(5);
		Assert.assertEquals(25, square.getArea());
	}
}
