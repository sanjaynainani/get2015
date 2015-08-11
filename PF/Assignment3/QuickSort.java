import java.util.Scanner;


/**
 * Java Program to sort numbers using QuickSort Algorithm. 
 * @author Sanjay Nainani
 */


public class QuickSort {
	
	public static void main(String[] args) {
		QuickSort object=new QuickSort();
		Scanner sc =  new Scanner(System.in);
		
		//totalElements Stores the number of elements in the array
		System.out.print("Enter the lenght of array");
		int totalElements=sc.nextInt();
		
		//to check if the length of array is greater than zero
		if(totalElements==0){
			System.out.println("Please Enter positive value");
		}
		
		//to execute the sorting if the array elements are greater than zero
		else{
			int[] array=new int[totalElements];

			System.out.print("Enter the Array Elements");
			for(int i=0;i<totalElements;i++){
				array[i]=sc.nextInt();
			}
			int left=0;
			int right=totalElements-1;
			object.quickSort(array,left,right);
			System.out.println("Sorted Elements are : ");
			for(int i=0;i<totalElements;i++){
				System.out.println(array[i]);
			}
		}
		
	}
	
	
	/**
	 * This method does the partitioning of the array around the 
	 * pivot Element which the middle element of the array.
	 * @param array = input array
	 * @param left = index of the array
	 * @param right = length of the array
	 * @return the sorted array
	 */
	int partition(int array[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      
	      // pivot is middle index
	      int pivot = array[(left + right) / 2];
	     
	      
	      // Divide into two arrays
	      while (i <= j) {
	    	  
	    	  
	    	  /**
	             * We will check a number from left side which is greater then the pivot value,
	             * and a number from right side which is less then the pivot value.
	             * Once search is complete, we can swap both numbers.
	             */
	    	  
	            while (array[i] < pivot)
	                  i++;
	            while (array[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = array[i];
	                  array[i] = array[j];
	                  array[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	
	/**
	 * This method implements and calls the quickSort method recursively
	 * @param array = input array
	 * @param left = index of the array
	 * @param right = length of the array
	 * @return array = the sorted array
	 */
	
	int[] quickSort(int array[], int left, int right) {
	      int index = partition(array, left, right);
	      if (left < index - 1)
	            quickSort(array, left, index - 1);
	      if (index < right)
	            quickSort(array, index, right);
	      return array;
	}

}
