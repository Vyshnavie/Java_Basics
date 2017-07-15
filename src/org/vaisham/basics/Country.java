package org.vaisham.basics;

public class Country {
	private String name;
	private Long population;
	private String capital;
	private String pm;
	private Double area;
	
	/**
	 * default constructor.
	 * Java provides the exactly same constructor.
	 * you needn't write it.
	 */
	public Country() {
		
	}
	
	/**
	 * this is a constructor that you wrote. it is a custome
	 * Constructor. It takes arguments as inputs and saves the name.
	 * @param name
	 */
	public Country(String name) {
		this.name = name;
	}
	public Country(String pm, Long population) {
		this.population = population;
		this.pm = pm;
	}
	
	
	/**
	 * This is an array of "State class".//should the name be same as
	 *  the class//
	 * This is an array of instances of state class
	 * They should be initialized and passed to the 
	 * array via getters and setters
	 * 
	 */
	private State[] state; //this is an array
	
	public String getName() {
		return name;
	}
	public String setName(String newName) {
		return newName = name;
	}
	public Long getPopulation() {
		return population;
	}
	public Long setPopulation(Long newPopulation) {
		return newPopulation = population;
	}
	public String getCapital() {
		return capital;
	}
	public String setCapital(String newCapital) {
		return newCapital = capital;
	}
	public String getPM() {
		return pm;
	}
	public String setPM(String newPM) {
		return newPM = pm;
	}
	public Double getArea() {
		return area; 
	}
	public Double setArea(Double newArea) {
		return newArea = area;
	}
	// write getter and setters for states
	public State[] getState() {
		return state;
	}
	public void setState(State[] state) {
		this.state = state;
	}
}
