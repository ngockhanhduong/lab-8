/**
 * A Daily Appointment is an object representing an appointment that
 * occurs daily. The Daily class inherits the Appointment class.
 * 
 * A Daily Appointment has a name.
 * 
 * @author Karina Duong
 * @version May 6, 2020
 */

public class Daily extends Appointment {
	
	public Daily(String name) {
    /**
     * Construct a new Appointment with an initName.
     * 
     * @param initName the name of the appointment
     */
		super(name);
	}
	
	/**
	 * The implementation of the occursOn() method.
	 * 
	 * Check whether this appointment occurs on a specified date. Since this
	 * is a daily appointment, the method always returns true.
	 * 
	 * @param d the day that needs to be checked
	 * @param m the month that needs to be checked
	 * @param y the year that needs to be checked
	 * 
	 * @returns whether the appointment occurs on that specified date
	 */
	public boolean occursOn(int d, int m, int y) {
		return true;
	}
}
