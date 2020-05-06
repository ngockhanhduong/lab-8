import java.util.ArrayList;

/**
 * An AppointmentList is a collection of Objects that inherits the Appointment
 * abstract class. This class is used to maintain the list of appointments.
 * This class also provides a method for printing all of the objects.
 * 
 * @author Karina Duong
 * @version May 6, 2020
 */

public class AppointmentList {
	private ArrayList<Appointment> appList;
	
	public AppointmentList() {
	/** 
	 * Construct a new empty appointment list.
	 */
    	appList = new ArrayList<Appointment>();
    }
	
	/**
	 * Get the number of Appointment objects currently in the list.
	 * 
	 * @return the number of appointments in the list
	 */
	public int getSize() {
        return appList.size();
    }
	
	/**
	 * Add a new Appointment object to the end of the list.
	 * 
	 * @param app the Appointment object that needs to be added
	 */
	public void addAppointment(Appointment app) {
    	appList.add(app);
    }
	
	/**
	 * Remove a specified Appointment object to the from the list.
	 * 
	 * @param app the Appointment object that needs to be removed
	 */
    public void removeAppointment(Appointment app) {
    	appList.remove(app);
    }
    
	/**
	 * Get the Appointment object at a specific index.
	 * 
	 * @param app the Appointment object that needs to be obtained
	 * 
	 * @return the Appointment object at the specified index
	 */
    public Appointment getAppointment(int index) {
    	return appList.get(index);
    }
    
    /**
     * Print all the Appointment objects currently in the list.
     */
    public void printAll() {
    	for (int i=0; i<this.getSize(); i++) {
    		Appointment app = getAppointment(i);
    		System.out.println(app.getName());
    	}
    }
}
