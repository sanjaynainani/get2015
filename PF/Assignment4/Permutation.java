/**
 * Java program to implement the permutation and combination of letters in a word
 * @author Sanjay Nainani
 */

import java.util.*;

public class Permutation {
	
	public static void main(String[] args) {
		Permutation object =new Permutation();
		List<String> finalString= new ArrayList<String>();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the string for which you want to get the Combinations");
		String str=scan.nextLine(); 
		object.permutation("", str,finalString);
		scan.close();
		Iterator<String> objectIterator = finalString.iterator();
		while(objectIterator.hasNext()){
		       System.out.println(objectIterator.next());
		}
		 finalString.clear();
	}
	
	/**
	 * This permutation method implements all the combinations of the letter of a word
	 * @param prefix = the first letter and the upcoming changed first letter
	 * @param str = the word for which we have to find out the combinations
	 * @param finalString = stores all the combinations of the letters of the word
	 * @return finalString
	 */
	public List<String> permutation(String prefix, String str,List<String> finalString){
        int length = str.length();
        if (length == 0) 
            finalString.add(prefix);
        else {
            for (int i = 0; i < length; i++)
                permutation(prefix + str.charAt(i), 
            str.substring(0, i) + str.substring(i+1),finalString);
        }
     return finalString; 
    }

}
