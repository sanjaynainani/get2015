/**
 * Class for transpose of matrix
 * @author Sanjay Nainani
 */

import java.util.Scanner;


public class Matrix {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		Matrix object= new Matrix();
		System.out.println("Enter the number of rows");
		int rows=input.nextInt();
		System.out.println("Enter the number of columns");
		int columns=input.nextInt();
		int[][] elements=new int[rows][columns];
		System.out.println("Enter the array Elements");
		elements=object.addElements(rows, columns, elements);
		System.out.println("The Original Matrix");
		object.showElements(elements,rows,columns);
		System.out.println("Transposed Matrix");
		elements=object.transposeMatrix(elements, rows, columns);
		object.showElements(elements, rows, columns);

		
	}
	
	
	/**
	 * This method is for transforming rows and columns of a matrix
	 * @param elements = array containing elements
	 * @param rows = total number of rows
	 * @param columns = total number of columns
	 * @return transposed matrix
	 */
	int[][] transposeMatrix(int[][] elements,int rows, int columns){
		int[][] transposedMatrix=new int [columns][rows];
		for(int i=0;i<columns;i++)
		{
			for(int j=0;j<rows;j++)
			{
				transposedMatrix[i][j]=elements[j][i];
			}
		}
		return transposedMatrix;
	}
	
	void showElements(int[][] elements,int rows,int columns){
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(elements[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	/**
	 * This method is used to add elements to the array
	 * @param row = total number of rows
	 * @param column = total number of columns
	 * @param element = array to contain elements
	 * @return = array of elements
	 */
	
	int[][] addElements(int row,int column, int[][] element){
		int i=0,j=0;
		
		int[][] elementsTemp=new int[row][column];
		for(i=0;i<row;i++)
        {
            for(j=0;j<column;j++)
            {
               elementsTemp[i][j] = input.nextInt();
            }
        }
		return elementsTemp;
		
	}

}
