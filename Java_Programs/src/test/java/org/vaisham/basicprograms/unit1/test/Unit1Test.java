package org.vaisham.basicprograms.unit1.test;

import org.junit.Assert;
import org.junit.Test;
import org.vaisham.basicprograms.unit1.Unit1;

public class Unit1Test {
	private Unit1 unit1 = new Unit1();
	
	@Test
	public void test_get_odds_desc() {
		int sol1[] = unit1.get_odds_desc(1);
		int[] ans1 = {1};
		Assert.assertArrayEquals(ans1, sol1);
		
		int sol2[] = unit1.get_odds_desc(3);
		int[] ans2 = {5, 3, 1};
		Assert.assertArrayEquals(ans2, sol2);
		
		int sol3[] = unit1.get_odds_desc(0);
		int[] ans3 = null;
		Assert.assertArrayEquals(ans3, sol3);
		
		int sol4[] = unit1.get_odds_desc(6);
		int[] ans4 = {11, 9, 7, 5, 3, 1};
		Assert.assertArrayEquals(ans4, sol4);
	}
	
	@Test
	public void test_get_even_desc() {
		int sol1[] = unit1.get_even_desc(1);
		int[] ans1 = {2};
		Assert.assertArrayEquals(ans1, sol1);
		
		int sol2[] = unit1.get_even_desc(3);
		int[] ans2 = {6, 4, 2};
		Assert.assertArrayEquals(ans2, sol2);
		
		int sol3[] = unit1.get_even_desc(0);
		int[] ans3 = null;
		Assert.assertArrayEquals(ans3, sol3);
		
		int sol4[] = unit1.get_even_desc(6);
		int[] ans4 = {12, 10, 8, 6, 4, 2};
		Assert.assertArrayEquals(ans4, sol4);
	}

	public void test_get_multiples_desc() {
		int sol1[] = unit1.get_multiples_desc(4, 8);
		int[] ans1 = {32, 28, 24, 20, 16, 12, 8, 4};
		Assert.assertArrayEquals(ans1, sol1);
		
		int sol2[] = unit1.get_multiples_desc(0, 0);
		int[] ans2 = null;
		Assert.assertArrayEquals(ans2, sol2);
		
		int sol3[] = unit1.get_multiples_desc(100, 0);
		int[] ans3 = null;
		Assert.assertArrayEquals(ans3, sol3);
		
		int sol4[] = unit1.get_multiples_desc(1, 1);
		int[] ans4 = {1};
		Assert.assertArrayEquals(ans4, sol4);
	}

	public void test_get_ascii_distance() {
		Assert.assertEquals(1, unit1.get_ascii_distance('a', 'b'));
		Assert.assertEquals(1, unit1.get_ascii_distance('b', 'a'));
		Assert.assertEquals(2, unit1.get_ascii_distance('9', '7'));
		Assert.assertEquals(31, unit1.get_ascii_distance('4', 'S'));
	}
}
