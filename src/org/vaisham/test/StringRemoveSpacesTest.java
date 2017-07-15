package org.vaisham.test;

import org.junit.Test;
import org.vaisham.basics.IStringRemoveSpaces;
import org.vaisham.basics.StringRemoveSpaces;

import org.junit.Assert;

public class StringRemoveSpacesTest {

	@Test
	public void TestArea() {
		
		IStringRemoveSpaces stringRemoveSpaces = new StringRemoveSpaces();
		
		char[] actual = {'a', ' ', 'c'};
		char[] expected = {'a', 'c'};
		
		/** 
		 * When passed to the object
		 * the object's method will return the 
		 * actual array containing
		 * {'a', 'b', 'c' , ' '}
		 */
		actual = stringRemoveSpaces.removeSpaces(actual);
		
		for(int i = 0; i < 3; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
	}
}
