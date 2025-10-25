package GasBooking;

import Customer.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

public class Booking extends GasConnection {
	public double otp = 123456, amount = 810, refund = 0;
	public String dt, delDate, status, DelMobilNo = "9876543211";
	public Date dt_1, dt_2;

	public Booking(String name, String mobNumber, String area, String street, int pincode, int noOfCylinder) {
		super(name, mobNumber, area, street, pincode, noOfCylinder);

	}

	@SuppressWarnings("resource")
	public void getDates() {
		System.out.println("Enter Booking Date : ");
		dt = new Scanner(System.in).next();
		dt_1 = null;
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");
		
		try {
			dt_1 = dateformat.parse(dt);
		} catch(Exception e) {
			System.out.println("The error in getDate function: " + e);
		}
		

//		Delivery details
		System.out.println("Enter Dilevery Date : ");
		delDate = new Scanner(System.in).next();
		try {
			dt_2 = dateformat.parse(delDate);
		}catch(Exception exe) {
			System.out.println("The error in Deliver Date function: " + exe);
		}
		
//   	find differnce of two dates		
		try {
			long difference = dt_2.getTime() - dt_1.getTime();
			
//			covert into days
			long newDiff = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
			
			if(newDiff > 7) {
				status = "P";
			}
		}catch(Exception exe) {
			System.out.print("Error while finding difference in dates " + exe);
		}		
		
	}

//	validate function for getting correct status
	public void validate() {
		// get the difference between two dates
		Long dtDiff = dt_1.getTime() - lastDate.getTime();
		long diff = TimeUnit.DAYS.convert(dtDiff, TimeUnit. MILLISECONDS);
		//print the diffe 	
		System.out.println("Difference between two dates is: " + diff);
		
		if (numbersOfCylinders == 1) { //booking for single cylinder
			if (diff <30) {
				System.out.println("booking cannot be done");
				
				// numberOfCylinders = 0;
				status =  "C"; 
		} else {
//		 	System.out.println("status: booked");
			status = "B"; //status booked
			lastDate = dt_1; //current booking date become last date for future
			}
		}else if(numbersOfCylinders == 2) {
			if(diff < 50) {
				System.out.println("booking cannot be done");
				status = "C";
			}else {
				status = "B";
				lastDate = dt_1;
			}
		}
}
}
