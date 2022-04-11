package chloe.ARM;

public class Arm {
	private String IDNumber;
	private String AType;
	
	public Arm(String IDNumber, String AType) {
		this.IDNumber=IDNumber;
		this.AType=AType;
	}
	
	public void displayInfo() {
		System.out.println("\tImperial Droid Component: Arm\tID Number:"+this.IDNumber+"\tAType:"+this.AType);
		
	}

}
