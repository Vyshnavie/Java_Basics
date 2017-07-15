package org.vaisham.basics;


public class MaxOFThreeNumbers implements IMaxOFThreeNumbers {

	/**
	 * find the max of 3 nos using the > or < operator
	 */
	@Override
	public int maxOfThreeNumbers(int a, int b, int c) {
		if(a > b && a > c){
			return a;
		}
		else if (b > a && b > c){
			return b;
		}
		else 
		return c;
	}

	/**
	 * find the max of 3 nos using the '? :' operator 
	 */
	@Override
	public int ternaryMaxOFThreeNumbers(int a, int b, int c) {
		int max = a > b ? a : b > c ? b:c > a? c: a;
		return max;
		
		
		
	}

}
