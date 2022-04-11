package chloe.LEG;

public class Leg {
	private String IDNumber;
	private String LType;
	
	public Leg(String IDNumber, String LType) {
		this.IDNumber=IDNumber;
		this.LType=LType;
	}
	
	public void displayInfo() {
		System.out.println("\tImperial Droid Component: Leg\tID Number:"+this.IDNumber+"\tLType:"+this.LType);
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public String getLType() {
		return LType;
	}

	public void setLType(String lType) {
		LType = lType;
	}

	
}
