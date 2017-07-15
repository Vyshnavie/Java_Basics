package org.vaisham.basics;

public class IncrementDecrement implements IIncrementDecrement {
// int num =10;
	/**
	 * increment the number by 1 time and return it
	 */
	@Override
	public int singleIncrement(int num) {
		num += 1;
		return num;
	}

	/**
	 * increment the number by 2 times and return it
	 */
	@Override
	public int doubleIncrement(int num) {
		num = num + 2;
		return num;
	}

	/**
	 * decrement the number by 1 time and return it
	 */
	@Override
	public int singleDecrement(int num) {
		num -= 1;
		return num;
	}
	
	/**
	 * decrement the number by 2 times and return it
	 */
	@Override
	public int doubltDecrement(int num) {
		num = num - 2;
		return num;
	}

	@Override
	public int Increment(int num1) {
		// TODO Auto-generated method stub
		
		num1 = num1 + 5;
		return num1;
	}

	@Override
	public int Decrement(int num2) {
		// TODO Auto-generated method stub
		num2 = num2 - 5;
		return num2;
	}

}

