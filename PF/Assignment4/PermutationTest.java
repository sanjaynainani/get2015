/**
 * Test program to test the permutations and combination of letters in a word
 */

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PermutationTest {

	Permutation testObject=new Permutation();
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
	 * To find all the combinations of the letter 'a','b','c'
	 */
	@Test
	public void test() {
		List<String> expList = new ArrayList<String>();
		List<String> actList = new ArrayList<String>();
		List<String> resList = testObject.permutation("","abc",actList);
		expList.add("abc");
		expList.add("acb");
		expList.add("bac");
		expList.add("bca");
		expList.add("cab");
		expList.add("cba");
		assertEquals(expList,resList);
	}
	
	
	
	/**
	 * To find all the combinations of the letter 'a','b','c','d'
	 */
	@Test
	public void test2() {
		List<String> expList = new ArrayList<String>();
		List<String> actList = new ArrayList<String>();
		List<String> resList = testObject.permutation("","abcd",actList);
		expList.add("abcd");
		expList.add("abdc");
		expList.add("acbd");
		expList.add("acdb");
		expList.add("adbc");
		expList.add("adcb");
		expList.add("bacd");
		expList.add("badc");
		expList.add("bcad");
		expList.add("bcda");
		expList.add("bdac");
		expList.add("bdca");
		expList.add("cabd");
		expList.add("cadb");
		expList.add("cbad");
		expList.add("cbda");
		expList.add("cdab");
		expList.add("cdba");
		expList.add("dabc");
		expList.add("dacb");
		expList.add("dbac");
		expList.add("dbca");
		expList.add("dcab");
		expList.add("dcba");
		
		assertEquals(expList,resList);
	}

}
