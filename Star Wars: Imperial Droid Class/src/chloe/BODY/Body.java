package chloe.BODY;

public class Body {
	
	private String IDNumber;
	private String BType;
	
	public Body(String IDNumber, String BType) {
		this.IDNumber=IDNumber;
		this.BType=BType;
	}
	
	public void displayInfo() {
		System.out.println("\tImperial Droid Component: Body\tID Number:"+this.IDNumber+"\tBType:"+this.BType);
		
	}

}
