import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class LinearSearchTest {

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

	/**
	 * Test Case for searching 88
	 */
	@Test
	public void test1() {
		LinearSearch testObject=new LinearSearch();
		int expected=0;
		int[] actual={2,5,8,9,10, 77, 55};
		assertEquals(expected,testObject.linearSearch(actual, 88));
	}
	
	/**
	 * Test Case for searching 77
	 */
	@Test
	public void test2() {
		LinearSearch testObject=new LinearSearch();
		int expected=5;
		int[] actual={2,5,8,9,10, 77, 55, 11};
		assertEquals(expected,testObject.linearSearch(actual, 77));
	}
	
	/**
	 * Test Case for searching 0
	 */
	@Test
	public void test3() {
		LinearSearch testObject=new LinearSearch();
		int expected=0;
		int[] actual={};
		assertEquals(expected,testObject.linearSearch(actual, 0));
	}

}
