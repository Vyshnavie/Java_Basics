package org.vaisham.basicprograms.unit3.test;

import org.junit.Assert;
import org.junit.Test;
import org.vaisham.basicprograms.unit3.Unit3;

/**
 * Created by vpathuri on 7/19/17.
 */
public class Unit3Test {

    @Test
    public void testDecodeType1test1() {
        Unit3 unit3 = new Unit3();
        Assert.assertEquals("abc", unit3.decodeStringType1("1#2#3"));
    }

    @Test
    public void testDecodeType1test2() {
        Unit3 unit3 = new Unit3();
        Assert.assertEquals("", unit3.decodeStringType1(""));
    }

    @Test
    public void testDecodeType1test3() {
        Unit3 unit3 = new Unit3();
        Assert.assertEquals("null", unit3.decodeStringType1("null"));
    }

    @Test
    public void testDecodeType1test4() {
        Unit3 unit3 = new Unit3();
        Assert.assertEquals("zebra", unit3.decodeStringType1("26#5#2#18#1"));
    }

    @Test
    public void testDecodeType1test5() {
        Unit3 unit3 = new Unit3();
        Assert.assertEquals("zyxwvutsrqponmlkjihgfedcba", unit3.decodeStringType1("26#25#24#23#22#21#20#19#18#17#16#15#14#13#12#11#10#9#8#7#6#5#4#3#2#1"));
    }

    @Test
    public void testDecodeType2test1() {
        Unit3 unit3 = new Unit3();
        Assert.assertEquals("abc", unit3.decodeStringType1("111213"));
    }

    @Test
    public void testDecodeType2test2() {
        Unit3 unit3 = new Unit3();
        Assert.assertEquals("", unit3.decodeStringType1(""));
    }

    @Test
    public void testDecodeType2test3() {
        Unit3 unit3 = new Unit3();
        Assert.assertEquals("null", unit3.decodeStringType1("null"));
    }

    @Test
    public void testDecodeType2test4() {
        Unit3 unit3 = new Unit3();
        Assert.assertEquals("zebra", unit3.decodeStringType1("126151221811"));
    }

    @Test
    public void testDecodeType2test5() {
        Unit3 unit3 = new Unit3();
        Assert.assertEquals("zyxwvutsrqponmlkjihgfedcba", unit3.decodeStringType1("226225224223222221220219218217216215214213212211210191817161514131211"));
    }
}
