import java.util.Scanner;
public class pyramid2 {
	public static void main(String[] args) {
		int m, number, j;
		pyramid2 object2 = new pyramid2();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rows. "); 			
		number = sc.nextInt();										//number of rows
		m = 2*number-1;												//total number of rows
		String[] result = new String[m];
		result = object2.printDiamond(number); 						//final output array
		for(j=0;j<m;j++){
			System.out.println(result[j]);
		}
		sc.close();
	}
	
	
	//This function prints the whole pyramid.
	
	String[] printDiamond(int number){
		String spaceStr, digitStr, arrayRow;
		int m = 2*number-1;
		String[] output = new String[m];
		int i, j=0;
		for(i=1;i<=number;i++){
			spaceStr = spaces(i,number);   						//string to store left spaces of one row of the output
			digitStr = digits(i,number);						//string to store left digits of one row of the output
			arrayRow = spaceStr + digitStr;						//concatenation of left spaces and rows  
			output[j] = arrayRow;								//storing in array
			j++;
		}
		for(i=number-1;i>=1;i--){
			spaceStr = spaces(i,number);						//string to store the bottom left spaces
			digitStr = digits(i,number);						//string to store the bottom right spaces
			arrayRow = spaceStr + digitStr;						//concatenation of spaces and digits
			output[j] = arrayRow;								//storing in array
			j++;
		}
		return output;											
	}
	
	// function to print spaces
	
	public static String spaces(int i, int number){				
		String temp = "";
		for(int j=0;j<number-i;j++)
			temp = temp + " ";
		return temp;
		
	}
	
	//function to print digits
	
	public static String digits(int i, int number){
		String temp = "";
		int j;
		for(j=1;j<=i;j++)
			temp = temp + j;
		for(j=i-1;j>=1;j--)
			temp = temp + j;
		return temp;
	}
}
