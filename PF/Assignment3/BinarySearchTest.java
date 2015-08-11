import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class BinarySearchTest {

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
	 * Test to search an element which is not present in the array
	 */
	@Test
	public void test() {
		BinarySearch testObject= new BinarySearch();
		int expected=0;
		int[] actual={2,5,8,9,10, 55, 77};
		assertEquals(expected,testObject.binarySearch(actual,88,6,0));
	}
	
	/**
	 * Test to search an element which is present in the array
	 */
	@Test
	public void test1() {
		BinarySearch testObject= new BinarySearch();
		int expected=6;
		int[] actual={2,5,8,9,10, 55, 77};
		assertEquals(expected,testObject.binarySearch(actual,77,6,0));
	}
	
	

}
