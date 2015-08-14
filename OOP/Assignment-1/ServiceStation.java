/**
 * Java program to implement the working of the a service station
 * There are various mechanics and cars
 * The information for those cars and mechanics is stored in files which is read in their respective classes.
 * We are printing a report of the total cars serviced today and the total earning of the day
 */

import java.io.*;
import java.util.Iterator;
import java.util.List;


public class ServiceStation {

	public static void main(String[] args) throws IOException {
		
		
		//object of Mechanic class
		Mechanic mechanicObject = new Mechanic();
		
		//object of car class
		Car carObject = new Car();
		
		//mechanic info list containing mechanics information
		List<String> mechanicInfo = mechanicObject.readMechanicInfo();
		
		//car info list containing cars information
		List<String> carInfo = carObject.readCarInfo();
		
		//assignedMechanic list contain the list of mechanics assigned to various cars
		List<String> assignedMechanic = mechanicObject.assignMechanic(mechanicInfo,carInfo);
		ServiceStation object = new ServiceStation();
		int[] vehicles = new int[4];
		
		//method to print the report
		vehicles= object.printReport(assignedMechanic);
		System.out.println("Total cars serviced today");
		System.out.println("Sedan : " + vehicles[1]);
		System.out.println("Hatchbacks : " + vehicles[2]);
		System.out.println("SUV : " + vehicles[0]);
		System.out.println();
		System.out.println("Total Earnings for the day : " + vehicles[3]);
		
		
	}
	
	
	/**
	 * method to print the report on the console
	 * @param assignedMechanic = list of mechanics assigned to a car
	 * @return an array of information of different vehicles serviced and total earning
	 */
	int[] printReport(List<String> assignedMechanic){
		Iterator assignedMechanicIterator = assignedMechanic.iterator();
		int[] vehicles = new int[4];
		int countSuv=0,countSedan=0,countHatchback=0;
		
		while(assignedMechanicIterator.hasNext()){
			String temp = (String)assignedMechanicIterator.next();
			String[] vehiclesTemp = temp.split(",");
			
			if(vehiclesTemp[1].equals("suv")){
				countSuv++;
			}
			else if(vehiclesTemp[1].equals("sedan")){
				countSedan++;
			}
			else{
				countHatchback++;
			}
		}
		vehicles[0]=countSuv;
		vehicles[1]=countHatchback;
		vehicles[2]=countSedan;
		vehicles[3]=(countSuv * 5000) + (countSedan * 3000) + (countHatchback * 2000);
		return vehicles;
	}

}
