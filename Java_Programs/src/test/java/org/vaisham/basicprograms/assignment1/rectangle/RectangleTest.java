package org.vaisham.basicprograms.assignment1.rectangle;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

	
	@Test
	public void testArea() {
		IRectangle rectangle = new Rectangle();
		rectangle.setLength(10);
		rectangle.setBreadth(20);
		Assert.assertEquals(100, rectangle.getArea());
	}
}
