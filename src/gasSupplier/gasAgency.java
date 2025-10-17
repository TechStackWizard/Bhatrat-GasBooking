package gasSupplier;

public interface gasAgency {
	
	public String agencyName = "Bharat Gas";
	public int agencyCode = 12345;
	public String phoneNo = "8787665544";
	
	default void showAgency() {
		System.out.println("The agency Name : " + agencyName);
		System.out.println("The agency Code : " + agencyCode);
		System.out.println("The agency Phone number : " + phoneNo);
	}
	
	

}
