package org.vaisham.basics;

public class StringReverser implements IStringReverser {

	
	/**
	 * 
	 * 
	 * given a string 'input'
	 * 
	 * input is a char array.
	 * 
	 * eg: 
	 * 
	 * input is a char[] containing
	 * {'h', 'e', 'l', 'l', 'o'};
	 * 
	 * if you want the length of the input array,
	 * you can get it by input.length
	 * 
	 * eg:
	 * 
	 * int length = input.length;
	 * 
	 */
	@Override
	public char[] reverseString(char[] input) {
		
		/**
		 * iterating the string using i
		 * 
		 * from 0, 1, 2 ...... input.length/2
		 * 
		 * 
		 */
		int len = input.length;
		for(int i = 0; i < len/2; i++) {
			/**
			 * perform swap 
			 */
			char temp = input[i];
			input[i] = input[len - 1 - i];
			input[len - 1- i] = temp;
		}
		for(int j = 0; j < len ; j++){
			System.out.println("input=" +input[j]);
		}
		
		return input;

	}
	
	public static void main(String[] args) {
		StringReverser stringreverser = new StringReverser();
		char[] input = { 'h','i','e','s'};
		stringreverser.reverseString(input);
		
	}
}
