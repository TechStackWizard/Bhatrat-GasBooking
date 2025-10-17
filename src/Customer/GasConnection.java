package Customer;

import java.text.SimpleDateFormat;
import java.util.*;


public class GasConnection extends Customer{
	
	int numbersOfCylinders;
	static int connectionNumber = 100;
	String date;
	
	{
		connectionNumber ++;
	}
	
//	create a dateformat function
	Date lastDate = null;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
	
	

	public GasConnection(String name, String mobNumber, String area, String street, int pincode, int numberOfCylinder) {
		// TODO Auto-generated constructor stub
		super(name, mobNumber, area, street, pincode);
		this.numbersOfCylinders = numberOfCylinder;
	}
	
	public void getLastDate() {
		System.out.print("Enter Last Date : ");
		date = new Scanner(System.in).nextLine();
		
		try {
			lastDate = dateFormat.parse(date);			
		}catch(Exception e){
			System.out.println(e);
		}
	}
	

	
	
}
