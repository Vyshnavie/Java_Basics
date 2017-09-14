package org.vaisham.basicprograms.unit5;

public class Unit5 {

    /**
     * given a positive integer convert the number to binary form
     *
     * eg:
     *
     * 2 -> return "10"
     * 3 -> return "11"
     * 10 -> return "1010"
     * 0 -> return "0"
     *
     * @param number
     * @return
     */
    public String toBinaryString(int number) {
    	int decimal = number;
    	int [] output = new int[number];
    	StringBuffer sb = new StringBuffer();
    	if(number == 0) {
    		sb.append(number);
    		return sb.toString();
    	}
    	for(int i = 0; i <= number/2; i++) {
    		int n = decimal % 2;
    		output[i] = n;
    		
    		decimal = decimal / 2;	
    	}
    	for(int j = number/2; j >= 0  ;j--) {
    		sb.append(output[j]);
        }
    	 return sb.toString();
    }

    /**
     * given a binaryString convert
     * the given string to its integer format
     * and return the value
     *
     * eg:
     *
     * "10" -> return 2
     * "11" -> return 3
     * "1010" -> return 10
     * "0" -> return 0
     *
     *
     * @param binaryString
     * @return
     */
 /*   public int toInteger(String binaryString) {
    	char [] output = binaryString.toCharArray();
    	int binary = Integer.parseInt(binaryString);
    	if(binaryString == "0") {
    		return binary;
    	}
    	for(int i = 0; i <= number/2; i++) {
    	
        return -1;
    }*/
}
