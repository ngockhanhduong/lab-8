import java.util.Scanner;

/**
 * Sample program that allows users to check all of the appointments that
 * occur on a specific date.
 *
 * @author Karina Duong
 * @version May 6, 2020
 */

public class AppointmentDemo {
	
    /**
     * Check and print all the appointments that occur on a specific date
     * determined by users. 
     * 
     * @param args none
     */
	public static void main(String[] args) {
		AppointmentList appList = new AppointmentList();
		
		OneTime ot1 = new OneTime("reputation Concert", 13, 12, 2020);
		appList.addAppointment(ot1);
		OneTime ot2 = new OneTime("Blue Neighborhood Concert", 05, 06, 2020);
		appList.addAppointment(ot2);
		
		Daily dl1 = new Daily("Voice Lessons");
		appList.addAppointment(dl1);
		Daily dl2 = new Daily("Work Out");
		appList.addAppointment(dl2);
		
		Monthly ml1 = new Monthly("Dentist", 5);
		appList.addAppointment(ml1);
		Monthly ml2 = new Monthly("Italian Table", 17);
		appList.addAppointment(ml2);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a date (M D Y): ");
		
		int m = in.nextInt();
		int d = in.nextInt();
		int y = in.nextInt();
		
		System.out.println("You have the following appointments on " + m + "/" + d + "/"+ y + "/" + ":");
		
		AppointmentList list = new AppointmentList();
		
		for (int i=0; i<appList.getSize(); i++) {
			Appointment curr = appList.getAppointment(i);
			if (curr.occursOn(d,m,y) == true) {
				list.addAppointment(curr);
			}
		}
		list.printAll();
	}
}
