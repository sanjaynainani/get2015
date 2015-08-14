/**
 * Class to read the information of the car from file
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Car {

	/**
	 * This method is used to read the information of cars from the file
	 * This information is stored in a list
	 * @return the list of information of the cars
	 * @throws IOException for file handling
	 */
	List<String> readCarInfo() throws IOException{
		
		String fileName = "C:/Users/Sanjay/Desktop/car.txt";

        String line = null;
        List<String> carInfo = new ArrayList<String>();

        try {
            FileReader fileReader =  new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
            	carInfo.add(line);
            }    

            bufferedReader.close();            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'"); 
            readCarInfo();
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
            readCarInfo();
            
        }
        return carInfo;
}
	
}
