package org.vaisham.test;

import org.junit.Assert;
import org.junit.Test;
import org.vaisham.basics.IRectangle;
import org.vaisham.basics.Rectangle;

public class RectangleTest {

	
	@Test
	public void testArea() {
		IRectangle rectangle = new Rectangle();
		rectangle.setLength(10);
		rectangle.setBreadth(20);
		Assert.assertEquals(200, rectangle.getArea());
	}
	
}

