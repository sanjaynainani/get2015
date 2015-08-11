import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		BinarySearch object=new BinarySearch();
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter the lenght of array");
		int totalElements=sc.nextInt();
		
		//To check the length of array
				if(totalElements<=0){
					System.out.println("Please enter positive length of array");
					totalElements=sc.nextInt();
				}
		int[] array=new int[totalElements];
		System.out.print("Enter the Sorted Array Elements");
		for(int i=0;i<totalElements;i++){
			array[i]=sc.nextInt();
		}
		
		 int max;
		 int min=0;
		max=array.length-1;
		System.out.print("Enter the Element to be searched");
		int Element = sc.nextInt();
		if(Element<array[min]||Element>array[max]){
			System.out.print("Element Does not exist");
			
		}
		else{
			
		int position;
		
		position=object.binarySearch(array,Element,max,min);
		System.out.print(position+1);
		}
		
	}
	
	int binarySearch(int[] array, int Element,int max,int min){
		if(Element<array[min]||Element>array[max]){
			System.out.print("Element Does not exist");
			return 0;
		}
		int mid=(max+min)/2;
		if(array[mid]==Element){
			return mid;
		}
		else if(array[mid]>Element){
			max=mid-1;
			return binarySearch(array,Element,max,min);	
		}
		else if(array[mid]<Element){
			min=mid+1;
			return binarySearch(array,Element,max,min);
		
		}
		return mid;
		}
}
