package org.vaisham.basics;


public class Triangle implements ITriangle {

	double l, h;//I changed to double
	
	public void setLength(double length) {
		// TO - DO
		this.l = length;
	}

	public void setHeight(double height) {
		// TO - DO
		this.h = height;
	}

	/**
	 * calculate the area of a triangle and return it
	 */
	public double getArea() {
		// TO - DO
		//I changed to double because i couldnt get the correct answer when half is multiplied. Int takes 1/2 as 0 when rounding off.
		double area =  0.5 * l* h;
		return area;
	}

}
