/**
 * Java program to find out the largest digit in the number
 * @author Sanjay Nainani
 */

import java.util.Scanner;


public class LargestDigit {
	long largestDig = 0;
	public static void main(String[] args) {
		long Number;
		LargestDigit object1 = new LargestDigit();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Number ");
		Number = sc.nextLong();
		
		
		//to check if the number is greater than zero
		if(Number<=0){
			System.out.println("Please enter positive number");
		}
		sc.close();
		
		
		long largestDig1 = object1.largest_Digit(Number);
		System.out.print("The largest digit is "+ largestDig1);
	}
	
	
	/**
	 * This is the method to calculate the largest digit in a number.
	 * This method is called recursively to check for the largest digit.
	 * @param Number = input value
	 * @return largestDig = largest digit in a number
	 */
	long largest_Digit(long Number){
		if(Number< 0){
			System.out.print("Please Enter a Positive Number");
		}
		
		else if(Number > 0){
			if(largestDig <= Number%10 ){
				largestDig=Number%10;
				
			}
			Number = Number/10;
			largest_Digit(Number);
			
		}
		return largestDig;
				
	}
}
