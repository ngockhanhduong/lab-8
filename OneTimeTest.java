import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OneTimeTest {
	private OneTime ot1;

	@Before
	public void setUp() throws Exception {
		ot1 = new OneTime("reputation Concert", 13, 12, 2020);
	}

	@Test
	public void testConstructor() {
		assertEquals("wrong name", "reputation Concert", ot1.getName());
	}
	
	@Test
	public void testOccursOn1() {
		assertTrue(ot1.occursOn(13, 12, 2020));
	}
	
	@Test
	public void testOccursOn2() {
		assertFalse(ot1.occursOn(12, 12, 2020));
	}
	
	@Test
	public void testOccursOn3() {
		assertFalse(ot1.occursOn(13, 11, 2020));
	}
	
	@Test
	public void testOccursOn4() {
		assertFalse(ot1.occursOn(13, 12, 2021));
	}
}
