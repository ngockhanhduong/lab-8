/**
 * A Monthly Appointment is an object representing an appointment that
 * occurs once every month. The Monthly class inherits the Appointment class.
 * 
 * A Monthly Appointment has a name and a day.
 * 
 * @author Karina Duong
 * @version May 6, 2020
 */

public class Monthly extends Appointment {
	private int day;
	
	public Monthly(String name, int day) {
    /**
     * Construct a new Appointment with an initName and a day.
     * 
     * @param initName the name of the appointment
     * @param day the day of the appointment
     */	
		super(name);
		this.day = day;
	}
	
	/**
	 * The implementation of the occursOn() method.
	 * 
	 * Check whether this appointment occurs on a specified date. Since this
	 * is a monthly appointment, the method returns true if the specified day
	 * matches with the day of the appointment.
	 * 
	 * @param d the day that needs to be checked
	 * @param m the month that needs to be checked
	 * @param y the year that needs to be checked
	 * 
	 * @returns whether the appointment occurs on that specified date
	 */
	public boolean occursOn(int d, int m, int y) {
		if (d==day) {
			return true;
		} else {
			return false;
		}
	}
}
