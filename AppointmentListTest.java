import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppointmentListTest {
	
	private AppointmentList appList;
	private OneTime ot1;
	private Daily dl1;

	@Before
	public void setUp() throws Exception {
		appList = new AppointmentList();
		
		ot1 = new OneTime("reputation Concert", 13, 12, 2020);
		
		dl1 = new Daily("Voice Lessons");
	}

	@Test
	public void testConstructor() {
		assertEquals(0, appList.getSize());
	}
	
	@Test
	public void testAddApp() {
		assertEquals(0, appList.getSize());
		appList.addAppointment(ot1);
		assertEquals(1, appList.getSize());
	}
	
	@Test
	public void testRemoveApp() {
		assertEquals(0, appList.getSize());
		appList.addAppointment(ot1);
		appList.addAppointment(dl1);
		assertEquals(2, appList.getSize());
		appList.removeAppointment(ot1);
		assertEquals(1, appList.getSize());
	}
	
	@Test
	public void testGetApp() {
		appList.addAppointment(ot1);
		assertEquals(ot1, appList.getAppointment(0));
	}

}
