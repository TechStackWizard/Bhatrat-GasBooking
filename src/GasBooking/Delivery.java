package GasBooking;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Delivery extends Booking{
	int customerOtp;
	public String delPersonName;
	
	public Delivery(String name, String mobNumber, String area, String street, int pincode, int noOfCylinder) {
		super(name, mobNumber, area, street, pincode, noOfCylinder);
	}
	
	public void amountCalc() {
		long diff = dt_2.getTime() - dt_1.getTime();
		long newDiff = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		
		if(newDiff > 7) {
			refund = 41.5;
			amount = amount - refund;
		}
	}
	
	public void verifyOTP() {
		if(status.equals("B")) {
			System.out.println("Enter OTP : ");
			customerOtp = new Scanner(System.in).nextInt();
			
			if(customerOtp != otp) {
				status = "C";
			}else {
				status = "D";
			}
			
		}else {
			System.out.println("No booking found!"); 
		}
	}
	public void delPersonDetails() {
		System.out.println("Enter the dilvery person name : ");
		delPersonName = new Scanner(System.in).nextLine();
	}
}
