import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class RemainderTest {

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
	 * For testing the remainder for 2 and 1
	 */
	@Test
	public void test() {
		Remainder testObject = new Remainder();
		int expected=0;
		assertEquals(expected,testObject.rem(2,1));
	}
	
	
	
	/**
	 * For testing the remainder for 100 and 3
	 */
	@Test
	public void test2() {
		Remainder testObject = new Remainder();
		int expected=1;
		assertEquals(expected,testObject.rem(100,3));
	}
	
	/**
	 * Test case when the dividend is zero
	 */
	@Test
	public void test3() {
		Remainder testObject = new Remainder();
		int expected=0;
		assertEquals(expected,testObject.rem(0,6));
	}
	
	

}
