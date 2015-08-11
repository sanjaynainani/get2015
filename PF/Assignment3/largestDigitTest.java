import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class largestDigitTest {

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
	 * test case to find the largest digit of 2
	 */
	@Test
	public void test1() {
		long test=new LargestDigit().largest_Digit(2);
		assertEquals(2,test);
	}
	
	
	
	/**
	 * test case to find the largest digit of 1257369
	 */
	@Test
	public void test2() {
		long test=new LargestDigit().largest_Digit(1257369);
		assertEquals(9,test);
	}
	
	/**
	 * test case to find the largest digit of 444
	 */
	@Test
	public void test3() {
		long test=new LargestDigit().largest_Digit(444);
		assertEquals(4,test);
	}
	
	/**
	 * test case to find the largest digit of 0
	 */
	@Test
	public void test4() {
		long test=new LargestDigit().largest_Digit(0);
		assertEquals(0,test);
	}
	
	
	

}
