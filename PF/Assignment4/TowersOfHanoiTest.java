/**
 * Test program to test the problem of towers of hanoi.
 */


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Test;


public class TowersOfHanoiTest {

	TowersOfHanoi testobject = new TowersOfHanoi();
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
	 * Method to check the problem for one disc
	 */
	@Test
	public void checkTowerOfHanoi()
	{
	
		List<String> expList = new ArrayList<String>();
		List<String> actList = new ArrayList<String>();
		List<String> resList = testobject.towerOfHanoi(1,"A", "C", "B",actList);
		expList.add("Move Disc 1 from A to B");
		assertEquals(expList,resList);
	}
	
	
	/**
	 * Method to check the problem for 2 Discs
	 */
	@Test
	public void checkTowerOfHanoi1()
	{
	
	List<String> expList = new ArrayList<String>();
	List<String> actList = new ArrayList<String>();
	List<String> resList = testobject.towerOfHanoi(2,"A", "C", "B",actList);
	expList.add("Move Disc 1 from A to C");
	expList.add("Move Disc 2 from A to B");
	expList.add("Move Disc 1 from C to B");
	assertEquals(expList, resList);
	}

	
	
	/**
	 * Method to check the problem for 3 Discs
	 */
	@Test
	public void checkTowerOfHanoi2()
	{
	List<String> expList = new ArrayList<String>();
	List<String> actList = new ArrayList<String>();
	List<String> resList = testobject.towerOfHanoi(3,"A", "C", "B",actList);
	expList.add("Move Disc 1 from A to B");
	expList.add("Move Disc 2 from A to C");
	expList.add("Move Disc 1 from B to C");
	expList.add("Move Disc 3 from A to B");
	expList.add("Move Disc 1 from C to A");
	expList.add("Move Disc 2 from C to B");
	expList.add("Move Disc 1 from A to B");

	assertEquals(expList, resList);
	}

}
