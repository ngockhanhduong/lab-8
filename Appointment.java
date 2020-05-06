/**
 * The Appointment class is an abstract class representing an Appointment
 * object with a name. The Appointment class contains an abstract method
 * occursOn() that needs to be implemented by all subclasses inheriting
 * Appointment class.
 * 
 * @author Karina Duong
 * @version May 6, 2020
 */

public abstract class Appointment {
	
	private String name;
	
	public Appointment(String initName) {
    /**
     * Construct a new Appointment with an initName.
     * 
     * @param initName the name of the appointment
     */
		name = initName;
	}
	
	/**
	 * Get the name of the Appointment
	 * 
	 * @return the name of the Appointment
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the new name for the Appointment
	 * 
	 * @param newName the new name of the Appointment
	 */
	public void setName(String newName) {
		name = newName;
	}
	
    /**
     * This method is invoked to check whether an appointment occurs
     * on a specified date. The method returns true if the appointment
     * occurs on that date and returns false if not.
     * 
     * @param d the day that needs to be checked
     * @param m the month that needs to be checked
     * @param y the year that needs to be checked
     * 
     * @return whether the appointment occurs on that date
     */
	public abstract boolean occursOn(int d, int m, int y);

}
