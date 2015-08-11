/**
 * Java Program to find remainder of 2 numbers. 
 * @author Sanjay Nainani
 */

import java.util.Scanner;
public class Remainder {
	public static void main(String[] args) {
		int Dividend, Divisor, Remainder;
		Remainder object1 = new Remainder();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the dividend ");
		Dividend = sc.nextInt();
		if(Dividend<0){
			System.out.println("Please enter a positive number");
			Dividend = sc.nextInt();
		}
		System.out.println("enter the divisor ");
		Divisor = sc.nextInt();
		
		//If divisor is Zero than we cannot divide it by zero.
		if(Divisor==0){
			System.out.println("Cannot Divide by Zero");
		}
		
		//In other cases we can find the remainder.
		else{
			Remainder = object1.rem(Dividend, Divisor);
			System.out.print("The Remainder is "+Remainder);
		}
		
	}
	
	
	/**
	 * This method is called recursively to generate the remainder of the 2 numbers
	 * @param Dividend
	 * @param Divisor
	 * @return Updated Dividend if there is any remainder
	 */
	int rem(int Dividend, int Divisor){
		if(Dividend==0){
			return 0;
		}
		else if(Dividend >= Divisor)
		{
			Dividend = Dividend - Divisor;
			return rem(Dividend,Divisor);
		}
		return Dividend;
	}
}
