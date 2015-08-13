/**
 * Test program to check the problem of N-Queens
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class NQueensTest {
	NQueens testObject = new NQueens();

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
	 * Test Case to check the problem for 4 queens
	 */
	@Test
	public void test() {
		int[][] expectedArray = {{0,1,0,0,},{0,0,0,1,},{1,0,0,0,},{0,0,1,0,}};
		int numberOfQueens=4;
		int[][] board = new int[numberOfQueens][numberOfQueens];
	    testObject.queens(0, board, numberOfQueens);
	    int check=testObject.checkArray(board, expectedArray, 4);
	    assertEquals(1,check);
	    
	    
	}
	
	
	/**
	 * Test Case to check the problem for 8 queens
	 */
	@Test
	public void test2() {
		int[][] expectedArray = {{1,0,0,0,0,0,0,0},{0,0,0,0,1,0,0,0},{0,0,0,0,0,0,0,1},{0,0,0,0,0,1,0,0},
								 {0,0,1,0,0,0,0,0},{0,0,0,0,0,0,1,0},{0,1,0,0,0,0,0,0},{0,0,0,1,0,0,0,0}};
		int numberOfQueens=8;
		int[][] board = new int[numberOfQueens][numberOfQueens];
	    testObject.queens(0, board, numberOfQueens);
	    int check=testObject.checkArray(board, expectedArray, 8);
	    assertEquals(1,check);
	    
	    
	}

}
