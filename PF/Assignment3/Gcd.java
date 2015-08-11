/**
 * Java program to calculate the Greatest Common Divisor of two numbers
  * @author Sanjay Nainani
 */

import java.util.Scanner;
public class Gcd {
	public static void main(String[] args) {
		int firstNumber, secondNumber, greatestCommonDivisor;
		Gcd object1 = new Gcd();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first Number ");
		firstNumber = sc.nextInt();
		
		//to check the if the first number is less than zero
		if(firstNumber<=0)
		{
			System.out.println("Please enter a positive number");
			firstNumber = sc.nextInt();
		}
		
		
		System.out.println("enter the second Number ");
		secondNumber = sc.nextInt();
		
		//to check if the second number is less than zero
		if(secondNumber<=0)
		{
			System.out.println("Please enter a positive number");
			secondNumber = sc.nextInt();
		}
		sc.close();
		greatestCommonDivisor = object1.gcd(firstNumber, secondNumber);
		System.out.print(greatestCommonDivisor);
	}
	
	/**
	 * This method is called recursively to generate the Greatest Common Divisor of two numbers
	 * @param firstNumber
	 * @param secondNumber
	 * @return
	 */
	int gcd(int firstNumber, int secondNumber){
		if(firstNumber > 0 && secondNumber > 0){
			if(firstNumber%secondNumber==0){
				return secondNumber;
			}
			else{
				return gcd(secondNumber,firstNumber%secondNumber);
			}
		}
		else{
			return -1;
		}
	}
}
