package org.vaisham.basicprograms.assignment1.triangle;

public class Triangle implements ITriangle {

	double l, h;
	
	public void setLength(double length) {
		// TO - DO
		this.l = length;
	}

	public void setHeight(double height) {
		// TO - DO
		this.l = height;
	}

	/**
	 * calculate the area of a triangle and return it
	 */
	public double getArea() {
		// TO - DO
		double Area = 0.5 * l * h;
		return Area;
	}

}
