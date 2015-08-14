/**
 * Class to implement the functionality of the mechanic
 * Here it has 2 methods 1 to read the info and other to assign the mechanic
 * It reads mechanic info from the file
 * Assigns the mechanic on the basis of availability and specialty
 * @author Sanjay Nainani
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Mechanic {
	
	/**
	 * This method reads the information from the file and stores it into a list
	 * @return arraylist of the information of the file
	 * @throws IOException for file handling
	 */
	
	List<String> readMechanicInfo() throws IOException{
		
		String fileName = "C:/Users/Sanjay/Desktop/mechanic.txt";

        String line = null;
        List<String> mechanicInfo = new ArrayList<String>();

        try {
            	FileReader fileReader = 
                new FileReader(fileName);

            	BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
            	mechanicInfo.add(line);
            }    

            bufferedReader.close();            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'"); 
            readMechanicInfo();
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");   
            readMechanicInfo();
            
        }
        return mechanicInfo;
}
	
	
	/**
	 * This method implements the assigning of mechanic to different cars.
	 * On the basis of availability and specialty
	 * @param mechanicInfo = list containing information of mechanic such as Id, Specialty, and Price for service and availability
	 * @param carInfo  = list containing information of car such as car type and number.
	 * @return list of mechanic which are assigned to any car and the car serviced.
	 */
	List<String> assignMechanic(List<String> mechanicInfo, List<String> carInfo){
		
		Iterator carItr= carInfo.iterator();
		List<String> assignedMechanic=new ArrayList<String>();
		
		
		while(carItr.hasNext()){
			String[] carTemp=((String)carItr.next()).split(",");
			
			Iterator mechanicItr= mechanicInfo.iterator();
			int mechanicBusy=0;
			while(mechanicItr.hasNext()){
				
				String temp=(String)mechanicItr.next();
				String[] mechanicTemp=temp.split(",");
				if(carTemp[1].equals(mechanicTemp[1]) && Integer.parseInt(mechanicTemp[3])==0){
					mechanicInfo.remove(mechanicBusy);
					assignedMechanic.add(mechanicTemp[0] + "," + mechanicTemp[1] + "," + mechanicTemp[2] + "," + carTemp[0] + "," + carTemp[1] );
					
					break;
							
				}
				mechanicBusy++;
				
				
			}
		}
		return assignedMechanic;
		
		
		
	}
	
	
}