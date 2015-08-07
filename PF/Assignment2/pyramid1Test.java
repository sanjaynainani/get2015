import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class pyramid1Test {

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

	//normal test case
	@Test
	public void testPrintPyramid() {
		pyramid1 testObj1 = new pyramid1();
		String[] expected = {"12345"," 1234","  123","   12","    1"};
		assertEquals(expected, testObj1.printPyramid(5));
	}

	
	//initial test case
	@Test
	public void testInitialPrintPyramid() {
		pyramid1 testObj1 = new pyramid1();
		String[] expected = {"1"};
		assertEquals(expected, testObj1.printPyramid(1));
		}
}
