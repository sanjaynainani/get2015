import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class gcdTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void test() {
		Gcd testObject = new Gcd();
		int expected = 1;
		assertEquals(expected, testObject.gcd(2, 1));
	}
	
	@Test
	public void test2() {
		Gcd testObject = new Gcd();
		int expected = 6;
		assertEquals(expected, testObject.gcd(12, 18));
	}
	
	@Test
	public void test3() {
		Gcd testObject = new Gcd();
		int expected = 1;
		assertEquals(expected, testObject.gcd(100, 3));
	}

}
