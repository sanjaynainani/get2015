/**
 * Java Program to implement the problem of tower of hanoi.
 * Here we have 3 towers, and numberOfDiscs number of discs
 * We have to move all the numberOfDiscs discs from one tower to another tower in ascending order top to bottom.
 * Only one disc could move at a single move.
 * 
 * @author Sanjay Nainani
 * 
 */

import java.util.*;
public class TowersOfHanoi {
	
	/**
	 * This towerOfHanoi method solves the problem
	 * @param numberOfDiscs = Total Discs
	 * @param start = Tower in which the discs are already placed 
	 * @param auxiliary = This is the mid tower which is used to transfer the discs
	 * @param end = This is the final node where we have to place the discs finally 
	 * @param finalString = It is the list which is used to store the total moves.
	 * @return finalString
	 */
	
	public List<String> towerOfHanoi(int numberOfDiscs, String start, String auxiliary, String end, List<String> finalString) {
	       if (numberOfDiscs == 1) {
	           finalString.add("Move Disc " + numberOfDiscs + " from " + start + " to " + end);

	       } else {
	           towerOfHanoi(numberOfDiscs - 1, start, end, auxiliary,finalString);
	           finalString.add("Move Disc " + numberOfDiscs + " from " + start + " to " + end);
	           towerOfHanoi(numberOfDiscs - 1, auxiliary, start, end,finalString);
	       }
	       return finalString;
	       
	   }

	   public static void main(String[] args) {
		   List<String> finalString= new ArrayList<String>();
	       TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       scanner.close();
	       towersOfHanoi.towerOfHanoi(discs, "A", "C", "B",finalString);
	       Iterator<String> object = finalString.iterator();
	      while(object.hasNext()){
	       System.out.println(object.next());
	      }
	      
	   }

}
