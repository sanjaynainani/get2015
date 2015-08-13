/**
 * Java program to implement the problem of N number of queens.
 * Here we have to place the N number of queens on a N*N board.
 * The queens have to be placed in such a way that no queen is in the same row as the previously placed queen
 * No queen should be in the same column as the previously placed queen and also in the diagonal
 */

import java.util.*;
public class NQueens {
	public static void main(String args[]) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the number of queens");
	    NQueens object = new NQueens();
	    int numberOfQueens=scan.nextInt();
	    int[][] board = new int[numberOfQueens][numberOfQueens];
	    object.queens(0, board, numberOfQueens);
	    for(int i = 0; i < numberOfQueens; i++) {
	      for(int j = 0; j < numberOfQueens; j++) {
	        if(board[i][j]==1){
	        	System.out.print("Q ");
	        }
	        else{
	        	System.out.print("* ");
	        }
	      }
	      System.out.println();
	    }
	    scan.close();
	  }
	
	
	/**
	 * This method is used to for testing the problem, If we have placed the queens in the right place it returns 1,
	 * @param board = N * N board where the queens have been placed
	 * @param checkArray = The N * N board to check if the queens are on the right place
	 * @param numberOfQueens = total number of queens
	 * @return 1 if the queens are rightly placed else false
	 */
	  public int checkArray(int[][] board, int[][] checkArray,int numberOfQueens){
		  for(int i=0;i<numberOfQueens;i++){
			  for(int j=0;j<numberOfQueens;j++){
				  if(checkArray[i][j]!=board[i][j]){
					  return 0;
				  }
				 
			  }
		  }
		  return 1;
		  
	  }
	  
	  /**
	   * This method places the queens on the board
	   * @param row = Row where the queen has to be placed
	   * @param board = N*N board to place the queens
	   * @param numberOfQueens = total number of queens
	   * @return true if all the queens are placed and false if queens not placed
	   */
	  boolean queens(int row, int[][] board, int numberOfQueens) {
	    if(row>=numberOfQueens){
	    	return true;
	    }
	    for(int column = 0; column < numberOfQueens; column++) {
	      if(isValid(board, row, column, numberOfQueens)) {
	        board[row][column] = 1;
	        if(!queens(row+1, board, numberOfQueens)) {
	          board[row][column] = 0;
	        } else
	          return true;
	      }
	    }
	    return false;
	  }

	 /**
	  * This method is used to check if the queens are placed at their right column.
	  * @param board = N*N board to place the queens
	  * @param row = Row to place the queens
	  * @param column = Column to place the queen
	  * @param numberOfQueens = total number of queens
	  * @return true if the queen is placed at its right position
	  */
	  
	  boolean isValid(int[][] board, int row, int column, int numberOfQueens) {
	    int i, j;
	    for(i = 0; i < row; i++){
	    	if(board[i][column]==1){
	    		return false;
	    	}
		        
	    }
	      
	    i = row - 1;
	    j = column - 1;
	    while((i>=0)&&(j>=0)){
	    	if(board[i--][j--]==1){
	    		return false;
	    	}
	    }
	      
	    i = row - 1;
	    j = column + 1;
	    while((i>=0)&&(j<numberOfQueens)){
	    	if(board[i--][j++]==1){
	    		return false;
	    	}
	    }
	      
	    return true;
	  }
}
