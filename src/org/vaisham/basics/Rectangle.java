package org.vaisham.basics;

public class Rectangle implements IRectangle{
	int l, b;
	
	public void setLength(int length) {
	//	int  l =5;
		this.l = length;
		
//		System.out.println("this.l =" +this.l);// prints the l value in the test class
//		System.out.println("l=" +l);// internal length l value is printed
//		System.out.println("this=" +this);// refers to this keyword 
//		System.out.println("Length = " +length); //external length value is printed
//		
		
	}

	public void setBreadth(int breadth) {
		this.b = breadth;
	}

	/**
	 * fill this
	 */
	public int getArea() {
		int area;
		return area = l* b;
		
	}

}


