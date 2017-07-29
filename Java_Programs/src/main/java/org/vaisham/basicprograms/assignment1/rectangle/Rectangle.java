package org.vaisham.basicprograms.assignment1.rectangle;

public class Rectangle implements IRectangle{

	int l, b;
	
	public void setLength(int length) {
		this.l = length;
	}

	public void setBreadth(int breadth) {
		// TO - DO
		this.b = breadth;
	}

	/**
	 * fill this
	 */
	public int getArea() {
		int Area = l * b;
		return Area;
	}

}
