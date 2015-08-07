import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class Assignment1Test {

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
	public void mytest()
	 {
		Assignment1 obj=new Assignment1();
		
		int u= obj.convertBinaryToOctal(1011100);
		
		assertEquals("This is correct", 134,u);
		
		
	 }

}
