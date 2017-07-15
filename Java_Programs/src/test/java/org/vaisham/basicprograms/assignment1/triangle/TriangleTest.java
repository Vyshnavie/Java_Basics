package org.vaisham.basicprograms.assignment1.triangle;

import org.junit.Test;

import org.junit.Assert;

public class TriangleTest {

	
	@Test
	public void testArea() {
		ITriangle triangle = new Triangle();
		triangle.setHeight(10);
		triangle.setHeight(40);
		Assert.assertEquals(200, triangle.getArea());
	}
}
