import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class pyramid2Test {

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
	public void testPrintDiamond() {
		pyramid2 testObj1 = new pyramid2();
		String[] expected = {"  1"," 121","12321"," 121","  1"};
		assertArrayEquals(expected, testObj1.printDiamond(3));
	}
	
	//initial test case
	@Test
	public void testPrintDiamondInitial() {
		pyramid2 testObj1 = new pyramid2();
		String[] expected = {"1"};
		assertArrayEquals(expected, testObj1.printDiamond(1));
	}

	
	//spaces test case
	@Test
	public void testSpaces() {
		pyramid2 testObj2 = new pyramid2();
		assertEquals("   ", testObj2.spaces(2, 5));
	}

	//digits test case
	@Test
	public void testDigits() {
		pyramid2 testObj3 = new pyramid2();
		assertEquals("12321", testObj3.digits(3, 5));
	}

}
