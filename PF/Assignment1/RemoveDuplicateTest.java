package removeDuplicate;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class RemoveDuplicateTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void removeDuplicateTest()
	{
		RemoveDuplicate obj=new RemoveDuplicate();
		int array1[]={2,5,4,6,8,5,9,3,3,6,3,9,1};
		int array[]=obj.removeDuplicate1(array1, 14);
		int arrayE[]={2,5,4,6,8,9,3,1,0,0,0,0,0,0};
		assertArrayEquals("Not equals",arrayE,array);// actuals);
		
		
	}
		

}
