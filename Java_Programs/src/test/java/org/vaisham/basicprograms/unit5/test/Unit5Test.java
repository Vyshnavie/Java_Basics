package org.vaisham.basicprograms.unit5.test;

import org.junit.Assert;
import org.junit.Test;
import org.vaisham.basicprograms.unit5.Unit5;

public class Unit5Test {
    Unit5 unit5 = new Unit5();

    @Test
    public void testToBinaryString1() {
        Assert.assertEquals("10", unit5.toBinaryString(2));
    }

    @Test
    public void testToBinaryString2() {
        Assert.assertEquals("11", unit5.toBinaryString(3));
    }

    @Test
    public void testToBinaryString3() {
        Assert.assertEquals("1010", unit5.toBinaryString(10));
    }

    @Test
    public void testToBinaryString4() {
        Assert.assertEquals("0", unit5.toBinaryString(0));
    }

  /* @Test
    public void testToInteger1() {
        Assert.assertEquals(2, unit5.toInteger("10"));
    }

    @Test
    public void testToInteger2() {
        Assert.assertEquals(10, unit5.toInteger("1010"));
    }

    @Test
    public void testToInteger3() {
        Assert.assertEquals(1, unit5.toInteger("1"));
    }

    @Test
    public void testToInteger4() {
        Assert.assertEquals(0, unit5.toInteger("0"));
    }*/
}
