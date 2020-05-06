/**
 * A OneTime Appointment is an object representing an appointment that
 * occurs only once. The OneTime class inherits the Appointment class.
 * 
 * A OneTime Appointment has a name, a day, a month, and a year.
 * 
 * @author Karina Duong
 * @version May 6, 2020
 */

public class OneTime extends Appointment {
	private int day;
	private int month;
	private int year;
	
	public OneTime(String name, int day, int month, int year) {
    /**
     * Construct a new Appointment with an initName, a day, a month, and a year.
     * 
     * @param initName the name of the appointment
     * @param day the day of the appointment
     * @param month the month of the appointment
     * @param year the year of the appointment
     */
		super(name);
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	/**
	 * The implementation of the occursOn() method.
	 * 
	 * Check whether this appointment occurs on a specified date. The method
	 * returns true only if all the input day, month, and year match the day,
	 * month, year of the appointment. 
	 * 
	 * @param d the day that needs to be checked
	 * @param m the month that needs to be checked
	 * @param y the year that needs to be checked
	 * 
	 * @returns whether the appointment occurs on that specified date
	 */
	public boolean occursOn(int d, int m, int y) {
		if (d==day && m==month && y==year) {
			return true;
		} else {
			return false;
		}
	}
}
