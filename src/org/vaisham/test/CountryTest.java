package org.vaisham.test;

import org.junit.Test;
import org.vaisham.basics.Country;
import org.vaisham.basics.State;

import junit.framework.Assert;

public class CountryTest {
	@Test
	public void sampleTest() {
		State state = new State();
		state.setName("Maharashtra");
		Assert.assertEquals("Maharashtra", state.getName());
		state.setName("Telangana");
		Assert.assertEquals("Telangana", state.getName());
		state.setName("Kashmir");
		Assert.assertEquals("Kashmir", state.getName());
		state.setName("Orissa");
		Assert.assertEquals("Orissa", state.getName());
	}
	
	
	
	/**
	 * 
	 *  Instantiation is assigning a value to the object created.
	 *  
	 *  int a; is defining it
	 *  a = 10; is initializing it.
	 *  This is a primitive data type.
	 *  
	 *  Other primitive data types are
	 *  String, boolean, double, long, float etc.
	 *  
	 *  Class is mostly same but also little different.
	 *  Creation of an object for a class type is same as creation
	 *  of an object for a primitive data type. you just declare the variable
	 *  
	 *  Country country;
	 *  Instantiation or Initialization of the object created above is done using a 
	 *  constructor. A constructor is a method that has the name of the class and no return 
	 *  type. For Country class the constructor is Country(). This is not defined. But Java internally
	 *  provides the constructor. You can create your own Constructors too. By default any constructor on invocation
	 *  creates and returns a new instance of the class. For eg. Country country = new Country(); does create a new Country
	 *  and returns to initialize the country object.
	 *  
	 *  you can also create Country objects using Country country1 = new Country("India");. This creates a new country class and
	 *  initializes the name as India internally and retuns the object.
	 *  
	 * 
	 * 
	 */
	public void demo() {
		/**
		 * both mean the same. Except that for second object the vairable name is already
		 * intialized or set to "USA".
		 */
		Country country1 = new Country();
		Country country2 = new Country("USA");
		
		
	}
	
	
	
	
	
	
	
	
	@Test
	public void testCountries() {
		// country initialization
		// this is class object craetion and instantiation
		// Country country = new Country();
		
		// Country object creation
		Country country;
		// Country object instantiation
		country = new Country();
		
		
		
		country.setName("India");
		country.setArea(2.285);
		country.setCapital("New Delhi");
		country.setPM("Narendra Modi");
		country.setPopulation(1200000000l);
		
		// country objects states creation and their initialization
		State[] states = new State[2];
		states[0] = new State();
		states[0].setName("Telangana");
		states[1] = new State();
		states[1].setName("Andhra Pradesh");
		
		// adding the above created states to the country object
		// fix this error
		country.setState(states);
	}
}
