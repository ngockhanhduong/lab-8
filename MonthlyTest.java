import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MonthlyTest {
	private Monthly ml1;

	@Before
	public void setUp() throws Exception {
		ml1 = new Monthly("Italian Table",17);
	}

	@Test
	public void testConstructor() {
		assertEquals("wrong name", "Italian Table", ml1.getName());
	}
	
	@Test
	public void testOccursOn1() {
		assertTrue(ml1.occursOn(17, 5, 2020));
	}
	
	@Test
	public void testOccursOn2() {
		assertFalse(ml1.occursOn(18, 5, 2020));
	}
	
	@Test
	public void testOccursOn3() {
		assertTrue(ml1.occursOn(17, 6, 2020));
	}
	
	@Test
	public void testOccursOn4() {
		assertTrue(ml1.occursOn(17, 6, 2021));
	}
}
