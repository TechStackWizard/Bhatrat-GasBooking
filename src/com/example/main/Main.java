package com.example.main;

import Customer.*;
import GasBooking.*;
import gasSupplier.*;

public class Main {
	
	static int count;
	static int bcount=0 , ccount = 0, dcount = 0, pcount = 0;
	
	static String dpname;
	
	public static void cylinderCount(Delivery obj[]) {
		String months[] = {
			    "January", "February", "March", "April", "May", "June",
			    "July", "August", "September", "October", "November", "December"
			};
		
		for(Delivery delivery : obj) {
			count = 0;
			System.out.println("In the month of " + (months[delivery.dt_2.getMonth()] + ":"));
			
			System.out.println(" * In "+ delivery.area);
			
			if(delivery.status.equals("D")) {
				count += delivery.numbersOfCylinders;
				
				System.out.println(" - " + count + " cylinder delivered...");
				
			}
			System.out.println("\n");
		}
	}
	
	public static void checkLateDel(Delivery [] obj) {
		String[] months = {"January", "february", "March", "April", "May", "June",
		"July", "August", "September", "October", "November", "December" };
		int[] month = new int[12];
		
		for (Delivery delivery: obj) {
			if(delivery.status.equals("D") && delivery.amount == 783.75 ){
				month [delivery.dt_2.getMonth()] += 1;
				/* february, month array at index 1st = 1; */
			}
		}
		System.out.println(". -late delivery- ");
		
		for(int i=0; i<12; i++){
			if(month[i] != 0){
				System.out.println("* In " + months [i] + "there are " + month[i]);
			}
		}
		System.out.println("\n");
		}
	
	
    public static void main(String[] args) {
        System.out.println("Hello, Eclipse!");
    }
}