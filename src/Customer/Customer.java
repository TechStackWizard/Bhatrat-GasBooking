package Customer;

import gasSupplier.gasAgency;

public class Customer {
	public String name;
	public String mobNumber;
	public String area;
	public String street;
	public int pinCode;
	
	public Customer(String name, String mobNumber, String area, String street, int pincode){
		this.name = name;
		this.mobNumber = mobNumber;
		this.area = area;
		this.street = street;
		this.pinCode = pincode;
	}
}
