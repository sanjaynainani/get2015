import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class mergeSortedArrayTest {

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
		int a[]={2,5,7,8,9};
		int b[]={3,5,6,8,10};
		int expected[]={2,3,5,5,6,7,8,8,9,10};
		int n=expected.length;
		int c[]=new int[n];
		int actual[]=new mergeSortedArray().join(a, a.length, b, b.length, c);
		assertArrayEquals(expected, actual);
	}

}
