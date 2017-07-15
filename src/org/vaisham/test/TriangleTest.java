package org.vaisham.test;

import org.junit.Test;
import org.vaisham.basics.ITriangle;
import org.vaisham.basics.Triangle;
import org.junit.Assert; 

public class TriangleTest {

	
	@Test
	public void testArea() {
		ITriangle triangle = new Triangle();
		triangle.setLength(10.0);
		triangle.setHeight(40.0);
		Assert.assertEquals(200.0, triangle.getArea(),0.0f); // I got an error
		//java.lang.AssertionError: Use assertEquals(expected, actual, delta) to compare floating-point numbers 	
		// So I added the 0.0f
	}
}
