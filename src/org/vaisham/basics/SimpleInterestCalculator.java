package org.vaisham.basics;

public class SimpleInterestCalculator implements ISimpleInterestCalculator {

	/**
	 * calculate and return the simple interest
	 */
	@Override
	public double calculate(double p, double t, double r) {
		double simple_interest = (p * t * r )/100;
		return simple_interest;
	}

}
