/**
 * java program to implement linear search using recursive calling of a method
 * @author Sanjay Nainani
 */

import java.util.Scanner;
public class LinearSearch {
	int position=0;
	public static void main(String[] args) {
	
		
		
		int Element,totalElements;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array");
		totalElements=sc.nextInt();
		
		
		//To check the length of array
		if(totalElements<=0){
			System.out.println("Please enter positive length of array");
			totalElements=sc.nextInt();
		}
		
		int[] array=new int[totalElements];
		System.out.print("Enter the array elements");
			for(int i=0;i<totalElements;i++){
				array[i]=sc.nextInt();
			}
				
		
		System.out.println("Enter the Element to find");
		Element = sc.nextInt();
		LinearSearch object = new LinearSearch();
		int position1;
		position1 = object.linearSearch(array,Element);
		
		//if the element does not exist then linearSearch method will return 0.
		if(position1==0){
			System.out.println("Element Does not exists");
		}
		else{
			System.out.print("The element is present at position " + (position1+1));
		}
		
		
		
	}
	
	
	/**
	 * This method is called recursively to find the element in the array
	 * @param array = input array
	 * @param Element = Element to be searched
	 * @return position
	 */
	int linearSearch( int[] array, int Element )
	{
		if(position<array.length){
			if(array[position]==Element){
				return position;
			}
			else{
				position++;
				
				return linearSearch(array, Element);
			}
				
			
		}
		else{
			return 0;
		}
		
	}
	
	
}
