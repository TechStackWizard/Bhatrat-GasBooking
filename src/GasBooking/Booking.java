package GasBooking;

import Customer.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Booking extends GasConnection {
	public double otp = 123456, amount = 810, refund = 0;
	public String dt, delDate, Status, DelMobilNo = "9876543211";
	public Date dt_1;
	
	
	public Booking(String name, String mobNumber, String area, String street, int pincode, int noOfCylinder) {
		super(name, mobNumber, area, street, pincode, noOfCylinder);
		
	}
	
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
	}
}
