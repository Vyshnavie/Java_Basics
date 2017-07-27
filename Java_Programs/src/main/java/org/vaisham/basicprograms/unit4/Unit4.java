package org.vaisham.basicprograms.unit4;

public class Unit4 {

    /**
     * compare two character arrays for equality.
     * return true if both the inputs are same
     *
     *
     * @param input1
     * @param input2
     * @return
     */
 /*   public boolean isEqual(char[] input1, char[] input2) {
    
    
    	if(input1 == null && input2 == null ) {
    		return true;
    	} 
    	else if(input2.length == 0 || input1.length == 0) {
    		return true;
    	}
    	
    	
    	
for(int i = 0; i < input1.length; i++) {
	for (int j = 0; j < input2.length; j++) {
		if(input2.length == input1.length && input2[i] == input1[j] ) {
			return true;
		}
		
		
	}
}
    	return false;
        
    }

    *//**
     * given two Strings
     * compare both the Strings and return true if
     * they are equal
     * and return false if
     * they are unequal
     *
     *
     * @param input1
     * @param input2
     * @return
     *//*
    public boolean isEqual(String input1, String input2) {
    	if(input1 == null || input2 == null) {
    		return true;
    	}
    else if(input1.length() == input2.length()) {
    		return true;
    	}
    	
    	else {
    		return false;
    	}
    	
    }*/

    /**
     * given a string,
     *
     * return true if the string is palindrome
     * or false if it is not
     *
     * eg: madam -> return true
     * eg: apple -> return false
     *
     * @param input
     * @return
     */
    public boolean isPalindrome(String input) {
    	if(input == null) {
    		return false;
    	}
    	else if(input.equals("")) {
    		return true;
    	}
    	char[] ch = input.toCharArray();
    	for(int i = 0; i < input.length()/2; i++) {
    		if(ch[i] == ch[input.length() -1 -i]) {
    			return true;
    		}
    	}
    	
        return false;
    }
}
