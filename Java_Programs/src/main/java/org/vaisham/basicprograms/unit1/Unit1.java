package org.vaisham.basicprograms.unit1;

public class Unit1 {

	/**
	 * given an integer 'count'
	 * 
	 * use this count to return an array of size 'count'
	 * containing the first 'count' no of positive odd numbers
	 * in descending order.
	 * 
	 * eg: get_odds_desc(3) would return [5, 3, 1]
	 * 
	 * get_odds_desc(6) would return [11, 9, 7, 5, 3 ,1]
	 * 
	 * @param count
	 * @return
	 */
	public int[] get_odds_desc(int count) {
		return null;
	}
	
	/**
	 * given an integer 'count'
	 * 
	 * use this count to return an array of size 'count'
	 * containing the first 'count' no of positive even numbers
	 * in descending order.
	 * 
	 * eg: get_even_desc(3) would return [6, 4, 2]
	 * 
	 * get_even_desc(6) would return [12, 10, 8, 6, 4, 2]
	 * 
	 * @param count
	 * @return
	 */
	public int[] get_even_desc(int count) {
		return null;
	}
	
	/**
	 * given a number and a count
	 * 
	 * return the first 'count' multiples of 'number'
	 * in descending order
	 * 
	 * eg: get_multiples_desc(4, 8) would return
	 * 
	 * [32, 28, 24, 20, 16, 12, 8, 4]
	 * 
	 * 
	 * @param number
	 * @param count
	 * @return
	 */
	public int[] get_multiples_desc(int number, int count) {
		return null;
	}
	
	/**
	 * Browse the table given in the following link
	 * @link http://www.asciitable.com/
	 * 
	 * every literal/character/special symbol in computers
	 * have no meaning actually. a computer doesn't understand
	 * 'apple' when you have a string 'apple'. It only understands
	 * 0s and 1s. So in order to have character representations in computer
	 * programming the American Standard Code for Information Interchange was
	 * created. This is abbreviated as ASCII. This is a table mapping a number to
	 * a character. The ascii representation of a 'a' is 97. similarly 'b' is 98. Thus
	 * 'z' is represented as 122. Similarly 'A' is represented as 65. Not only the alphabet
	 * even digits and special symbols (such as !,@,#,$,%,^,&,*,',",? and so on) are also represented.
	 * 
	 * 
	 * Recently even emojis and other international language characters like 'తె' 'లు' 'గు' can be represented 
	 * but not in ASCII. Some other table.
	 * 
	 * Now this function should return the modulus of distance between any two characters 'first' & 'second'
	 * 
	 * eg: 
	 * 
	 * get_ascii_distance('a', 'b') returns 1
	 * get_ascii_distance('b', 'a') returns 1
	 * get_ascii_distance('9', '7') returns 2
	 * get_ascii_distance('4', 'S') returns 31
	 * 
	 * 
	 * refer to the table given above url
	 * 
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	public int get_ascii_distance(char first, char second) {
		return 0;
	}
}
