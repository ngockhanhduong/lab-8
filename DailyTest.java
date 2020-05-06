import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DailyTest {
	private Daily dl1;

	@Before
	public void setUp() throws Exception {
		dl1 = new Daily("Voice Lessons");
	}

	@Test
	public void testConstructor() {
		assertEquals("wrong name", "Voice Lessons", dl1.getName());
	}
	
	@Test
	public void testOccursOn1() {
		assertTrue(dl1.occursOn(13, 12, 2020));
	}
	
	@Test
	public void testOccursOn2() {
		assertTrue(dl1.occursOn(12, 12, 2020));
	}
	
	@Test
	public void testOccursOn3() {
		assertTrue(dl1.occursOn(13, 11, 2020));
	}
	
	@Test
	public void testOccursOn4() {
		assertTrue(dl1.occursOn(13, 12, 2021));
	}
}
