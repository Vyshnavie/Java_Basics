package org.vaisham.basicprograms.unit4.test;

import org.junit.Assert;
import org.junit.Test;
import org.vaisham.basicprograms.unit4.Unit4;

public class Unit4Test {

    Unit4 unit4 = new Unit4();

  /* @Test
    public void testisEqualCharArrays1() {
        char[] input1 = {'a', 'p', 'p', 'l', 'e'};
        char[] input2 = {'a', 'p', 'p', 'l', 'e'};
        Assert.assertEquals(true, unit4.isEqual(input1, input2));
    }

    @Test
    public void testisEqualCharArrays2() {
        char[] input1 = {'a', 'p', 'p', 'l', 'e'};
        char[] input2 = {'a', 'p', 'p', 'e'};
        Assert.assertEquals(false, unit4.isEqual(input1, input2));
    }

    @Test
    public void testisEqualCharArrays3() {
        char[] input1 = null;
        char[] input2 = null;
        Assert.assertEquals(true, unit4.isEqual(input1, input2));
    }

    @Test
    public void testisEqualCharArrays4() {
        char[] input1 = {};
        char[] input2 = {};
        Assert.assertEquals(true, unit4.isEqual(input1, input2));
    }

    @Test
    public void testisEqualCharArrays5() {
        char[] input1 = {' '};
        char[] input2 = {' '};
        Assert.assertEquals(true, unit4.isEqual(input1, input2));
    }

    @Test
    public void testisEqualCharArrays6() {
        char[] input1 = null;
        char[] input2 = {' '};
        Assert.assertEquals(false, unit4.isEqual(input1, input2));
    }

    @Test
    public void testisEqualCharArrays7() {
        char[] input1 = {};
        char[] input2 = null;
        Assert.assertEquals(false, unit4.isEqual(input1, input2));
    }

    @Test
    public void testisEqualCharArrays8() {
        char[] input1 = {'a', 'p', 'p', 'l', 'e'};
        char[] input2 = {'a', 'p', 'p', 'l', 'e'};
        Assert.assertEquals(true, unit4.isEqual(input1, input2));
    }*/

    /*@Test
    public void testisEqualString1() {
        char[] input1 = {'a', 'p', 'p', 'l', 'e'};
        char[] input2 = {'a', 'p', 'p', 'l', 'e'};
        Assert.assertEquals(true, unit4.isEqual(new String(input1), new String(input2)));
    }

    @Test
    public void testisEqualString2() {
        char[] input1 = {'a', 'p', 'p', 'l', 'e'};
        char[] input2 = {'a', 'p', 'p', 'e'};
        Assert.assertEquals(false, unit4.isEqual(new String(input1), new String(input2)));
    }

    @Test
    public void testisEqualString3() {
        char[] input1 = null;
        char[] input2 = null;
        Assert.assertEquals(true, unit4.isEqual(new String(input1), new String(input2)));
    }

    @Test
    public void testisEqualString4() {
        char[] input1 = {};
        char[] input2 = {};
        Assert.assertEquals(true, unit4.isEqual(new String(input1), new String(input2)));
    }

    @Test
    public void testisEqualString5() {
        char[] input1 = {' '};
        char[] input2 = {' '};
        Assert.assertEquals(true, unit4.isEqual(new String(input1), new String(input2)));
    }

    @Test
    public void testisEqualString6() {
        char[] input1 = null;
        char[] input2 = {' '};
        Assert.assertEquals(false, unit4.isEqual(new String(input1), new String(input2)));
    }

    @Test
    public void testisEqualString7() {
        char[] input1 = {};
        char[] input2 = null;
        Assert.assertEquals(false, unit4.isEqual(new String(input1), new String(input2)));
    }

    @Test
    public void testisEqualString8() {
        char[] input1 = {'a', 'p', 'p', 'l', 'e'};
        char[] input2 = {'a', 'p', 'p', 'l', 'e'};
        Assert.assertEquals(true, unit4.isEqual(new String(input1), new String(input2)));
    }*/

    @Test
    public void testisPalindrome1() {
        String str = "";
        Assert.assertEquals(true, unit4.isPalindrome(str));
    }

    @Test
    public void testisPalindrome2() {
        String str = null;
        Assert.assertEquals(false, unit4.isPalindrome(str));
    }

    @Test
    public void testisPalindrome3() {
        String str = "apple";
        Assert.assertEquals(false, unit4.isPalindrome(str));
    }

    @Test
    public void testisPalindrome4() {
        String str = "madam";
        Assert.assertEquals(true, unit4.isPalindrome(str));
    }

    @Test
    public void testisPalindrome() {
        String str = "abcddcba";
        Assert.assertEquals(true, unit4.isPalindrome(str));
    }

    }
