package org.vaisham.basicprograms.unit3;

/**
 * Created by vpathuri on 7/19/17.
 */
public class Unit3 {

    /**
     *
     * Given a string represented as an encoded String. For example
     *
     * 1#23#12#1#2
     *
     * This is the representation of String
     * a - 1
     * w - 23
     * l - 12
     * a - 1
     * b - 2
     *
     * you need to construct this real String from the encoded String.
     * All the Strings will have hashes separating any two characters
     * represented as as set of digits
     *
     *
     * @param encodedString
     * @return
     */
    public String decodeStringType1(String encodedString) { 
    	
    	/*
        Step 1: check for base conditions
        Step 2: look till # or endOfString
        Step 3: construct the String
        */
        
        if(encodedString == "null" || encodedString.isEmpty() || encodedString.equals("")) 
        { return encodedString;
        }
        
        int number = 0;
        StringBuilder result = new StringBuilder();
        
        for(int index = 0; index < encodedString.length(); index++) {
          if(encodedString.charAt(index) >= '0' && encodedString.charAt(index) <= '9') {
            number *= 10;
            number += ((int)encodedString.charAt(index) - (int)'0');
          }
          else {
            result.append(getChar(number));
            number = 0;
          }
        }
        if(number != 0) {
            result.append(getChar(number));
        }
        return result.toString();
      }

    /**
    *  Use this helper function
    create simple helper functions
    
    **/
      private char getChar(int index) {
        char a = (char)((int)'a' + index - 1);
        return a;
      }
    /**
     *
     * Given a string represented as an encoded String. For example
     *
     * 11232121112
     *
     * This is the reprsentation of the String
     * a - (1 of length 1)
     * w - (23 of length 2)
     * l - (12 of length 2)
     * a - (1 of length 1)
     * b - (2 of length 2)
     *
     * you need to construct this real String from the encoded String.
     * All the Strings will have numbers denoting the length of the character's digits -
     * either 1 or 2.
     *
     * @param encodedString
     * @return
     */
    public String decodeStringType2(String encodedString) {
        return null;
    }

}
