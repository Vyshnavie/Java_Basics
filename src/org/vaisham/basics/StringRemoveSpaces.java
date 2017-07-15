package org.vaisham.basics;

public class StringRemoveSpaces implements IStringRemoveSpaces {

	/**
	 * 
	 * 
	 * 
	 * 
	 * Do first StringReverser before any other string related problems.
	 * 
	 * 
	 * given a string containing the following string
	 * 
	 * 'This is a sample string'
	 * represented as
	 * { 'T', 'h', 'i',  's',  '',  'i',  's',  '',  'a',  '',  's',  'a',  'm',  'p',  'l',  'e',  '',  's', 't',  'r',  'i',  'n',  'g'}
	 *  
	 * The problem asks you to remove the spaces in the string and convert it into
	 * { 'T', 'h', 'i',  's',  'i',  's',  'a',  's',  'a',  'm',  'p',  'l',  'e',  's',  't',  'r',  'i',  'n',  'g', '',  '',  '',  '' }
	 * 
	 * 
	 * 
	 * 
	 */
	@Override
	public char[] removeSpaces(char[] input) {
		int newIndex = 0;
		int currentIndex = 0;
		for(int i = 0; i <  input.length; i++) {
		if(input[i]!=' ') {
			input[newIndex] = input[currentIndex];
			newIndex++;
			currentIndex++;
		}
		else
			currentIndex++;
		}
		//int count = currentIndex - newIndex;
		//input[newIndex] = 0;
		
		return input;
	}
	public static void main(String[] args) {
		StringRemoveSpaces stringremove = new StringRemoveSpaces();
		char [] input = {'h',' ',' ',' ','i',' ', ' ','e',' '} ; 
		stringremove.removeSpaces(input);
	}
}
	/**
	 * 
	 * 
	 * 
	 * 
	 * A good solution. probably one of the most used solution.
	 * 
	 * But can we do better. aren't we creating another copy of 'input' string.
	 * 
	 * 
	 * 
	 * @Override
	public char[] removeSpaces(char[] input) {
		
		//Using string buffer/string builder to change the string /character array. we cannot change the string as it is mutable.
		StringBuilder stringbuilder = new StringBuilder();
		for(int i = 0;i <= input.length;i++) {
			if(input[i] != ' ') {
				 stringbuilder.append(input);
			}
		}
		return input;
	}
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
