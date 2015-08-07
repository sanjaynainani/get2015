import java.util.*;
public class Assignment1
{
	public static void main(String arg[])
	{
		System.out.print("Enter the number ");
		Scanner sc=new Scanner(System.in);
		int binaryNumber =sc.nextInt();
		Assignment1 bTO=new Assignment1();
		System.out.println("Octal form of "+binaryNumber+"="+bTO.convertBinaryToOctal(binaryNumber));
		sc.close();
	}
	int convertBinaryToOctal(int n)
	{
		int count=0,octal=0;
		while(n!=0)
		{
			int sum=0;
					for(int count2=0; count2<3;count2 ++)
					{if(n==0)
						break;
						int remainder =n%10;
						n/=10;
						sum+=remainder*(int)Math.pow(2, count2);
					}
						
			octal+=sum*(int)Math.pow(10, count);
			count++;
		}
		return octal;
	}
	
}