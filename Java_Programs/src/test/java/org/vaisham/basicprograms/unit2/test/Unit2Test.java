package org.vaisham.basicprograms.unit2.test;

import org.junit.Assert;
import org.junit.Test;
import org.vaisham.basicprograms.unit2.Unit2;


public class Unit2Test {
	
	@Test
	public void testConvertLowerToUpperAndUpperToLower1() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("", unit2.convertLowerToUpperAndUpperToLower(""));
		
	}
	
	@Test
	public void testConvertLowerToUpperAndUpperToLower2() {
		Unit2 unit2 = new Unit2();
	
		Assert.assertEquals(null, unit2.convertLowerToUpperAndUpperToLower(null));
		
	}
	
	@Test
	public void testConvertLowerToUpperAndUpperToLower3() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("a", unit2.convertLowerToUpperAndUpperToLower("A"));
	}
	
	@Test
	public void testConvertLowerToUpperAndUpperToLower4() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("B", unit2.convertLowerToUpperAndUpperToLower("b"));
	}
	
	@Test
	public void testConvertLowerToUpperAndUpperToLower5() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("BBBB", unit2.convertLowerToUpperAndUpperToLower("bbbb"));
	}
	
	@Test
	public void testConvertLowerToUpperAndUpperToLower6() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("B11B", unit2.convertLowerToUpperAndUpperToLower("b11b"));
	}
	
	@Test
	public void testConvertLowerToUpperAndUpperToLower7() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("111", unit2.convertLowerToUpperAndUpperToLower("111"));
	}
	
	@Test
	public void testConvertLowerToUpperAndUpperToLower8() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("!@#$%^&*()", unit2.convertLowerToUpperAndUpperToLower("!@#$%^&*()"));
	}
	
	@Test
	public void testConvertLowerToUpperAndUpperToLower9() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("q    b    e", unit2.convertLowerToUpperAndUpperToLower("Q    B    E"));
	}
	
	@Test
	public void testConvertLowerToUpperAndUpperToLower10() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("                      ", unit2.convertLowerToUpperAndUpperToLower("                      "));
	}
	
	@Test
	public void testConvertLowerToUpperAndUpperToLower11() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("a                      ", unit2.convertLowerToUpperAndUpperToLower("A                      "));
	}
	
	@Test
	public void testConvertLowerToUpperAndUpperToLower12() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("                      Z", unit2.convertLowerToUpperAndUpperToLower("                      z"));
	}
	
	@Test
	public void testEncode1() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("123", unit2.encode("abc"));
	}
	
	@Test
	public void testEncode2() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("456", unit2.encode("def"));
	}
	
	@Test
	public void testEncode3() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("zzz", unit2.encode("262626"));
	}
	
	@Test
	public void testEncode4() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals("", unit2.encode(""));
	}
	
	@Test
	public void testEncode5() {
		Unit2 unit2 = new Unit2();
		
		Assert.assertEquals(null, unit2.encode(null));
	}
}
