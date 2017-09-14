package org.vaisham.basicprograms.unit6;

public class Unit6 {

    /**
     *
     * given a number, calculate the sum of all the
     * digits present in the number and return the sum
     *
     * eg: 123 -> return 6
     * eg: -123 -> return 6
     * eg: 1090 -> return 10
     * eg: 999 -> return 27
     * eg: 0 -> return 0
     *
     *
     * @param number
     * @return
     */
    public int returnSumOfDigits(int number) {
    	if(number == 0)
    	{
    		return 0;
    	}
    	int sum  = 0;
    	int n = 0;
    	int count = 0;
    	int abs = Math.abs(number);
    	int no = abs;
    	while(no != 0) {
    		no = no / 10;
    		++count;
    	}
    	for(int i = 0; i <= count; i++)
    	{ 
    		n = abs % 10;
    		sum = sum + n;
    		abs = abs / 10;
    	}
        return sum;
    }

    /**
     * given a numbers, calculate the reverse of the
     * digits in the number and return new number
     *
     * eg: 123 -> return 321
     * eg: 123456 -> return 654321
     * eg: -1 -> return 1w
     * eg: -100 -> return 1
     *
     *
     * @param number
     * @return
     */
   public int reverseAndReturn(int number) {
	  if(number == 0 ) {
		  return 0;
	  }
	   int sum = 0;
	   int count = 0;
	   int abs = Math.abs(number);
	   int n = abs ;
	   int count1 = 0;
	while(n != 0)
	{
		++count;
		n = n / 10;
	}
	for(int i = 0; i <= count; i++) {
		int r = abs  % 10;
		abs  = abs  /10;
		 int l = abs ;
		while( l > 0)
		{
			++count1;
			 l = l / 10;
		}
		int result = (int) Math.pow(10, count1);
		count1 = 0;
		int x = r * result;
		sum = sum + x;
	}
        return sum;
    }

  /*//**
     * Given a number return
     *  a. true if the number is divisible by 11
     *  b. false if the number is not divisible by 11
     *
     *  <condition>
     *      You cannot use % operator or / to directly check the divisibility
     *  </condition>
     *
     *
     * @param number
     * @return
     *//*
*/  
   public boolean isDivisibleBy11(int number) {
	   if(number <= 9) {
		   return false;
	   }
		  int no = number;
		  int n = number;
		  int num = number;
		  int k = 0;
		  int result = 0;
		  int firstDigit = 0;
		  int lastDigit = 0;
		   int count = 0;
		   while(no != 0) {
	 		no = no / 10;
	 		++count;
	 	}
		   if(count % 2 == 0) {
			   lastDigit = number % 10;
			   for(int  i = 0; i < count; i++) {
				   firstDigit = num % 10;
				   num = num / 10;
			   }
			   n = n - firstDigit * (int) Math.pow(10,count - 1);
			   n = n - lastDigit; 
		   if(n % 10  == 0)
		   {
			k = n/ 10;
		   }
		   
		result = k - lastDigit + firstDigit;
		   }
		   else
		   {
			   lastDigit = number % 10;
			   for(int  i = 0; i < count; i++) {
				   firstDigit = num % 10;
				   num = num / 10;
			   }
			   n = n - firstDigit * (int) Math.pow(10,count - 1);
			   n = n - lastDigit; 
		   if(n % 10  == 0)
		   {
			k = n/ 10;
		   }
		   result = k - lastDigit - firstDigit;
		   }
		   
		   int abs = Math.abs(result);
		  
		   if(abs % 11 == 0) {
			   return true;
		   }
		   else
			   {
			return false;
			   }
       
    }

    /**
     * given the lengths of sides of a triangle. return
     *  1. true if you can form a triangle with length of the three sides as a, b, c
     *  2. false if you cannot form a triangle
     *
     *  <conditions>
     *      the triangle can be any a. isosceles, scalene, right angled triangle, obtuse angle, acute angle
     *  </conditions>
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public boolean canFormATriangle(int a, int b, int c) {
    	//Length of the side of a triangle is less than the sum of the lengths of the other two sides 
    	// and greater than the difference of the other two sides.
    	if( a <= 0 || b <= 0 || c <= 0) {
    		return false;
    	}
    	
    	if( a < b + c && b < a + c && c < a + b ) {
    		return true;
    	}
    	else
    		return false;
    }
}
