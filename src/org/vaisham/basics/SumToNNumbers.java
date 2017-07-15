package org.vaisham.basics;

public class SumToNNumbers implements ISumToNNumbers {

	/**
	 *  Given a number N find the sum of all the 
	 *  natural numbers from 1 to N
	 *  
	 *  i.e calculate 1 + 2 + 3 + ..... + N
	 *  and return the above calculated Value
	 */
	@Override
	public long FindSumToNNumbers(int n) {
		
		 n = (n * (n+1))/2;
		return n;
	}
	/**
	* use a for loop and not formula
	*/
	public long FindSumToNNumbers2(int n) {
		int sum = 0;
		for ( int  i = 0; i <= n; i++){
			
			sum = sum + i;// very important
			
		}
		return sum;
	}

	public long FindSumToNNumbers3(int n) {
		int sum = 0;
		while( n > 0) {
			
			sum = sum + n;
			n--;
		}
		
		return sum;
	}
	
	

}

