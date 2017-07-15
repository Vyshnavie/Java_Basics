package org.vaisham.basicprograms;

/**
 * An interface sets contract for a class
 * 
 * Interface can only give function definitions.
 * The classes implementing this interface will define the
 * body for these functions
 * 
 * @author Vaishampayan Reddy
 *
 */
public interface IEmployee {
	
	/**
	 * 
	 * @param empName
	 */
	public void setName(String empName);
	
	/**
	 * 
	 * @param empAge
	 */
	public void setAge(int empAge);
	
	/**
	 * 
	 * @return
	 */
	public String getName();
	
	/**
	 * 
	 * @return
	 */
	public int getAge();
}
