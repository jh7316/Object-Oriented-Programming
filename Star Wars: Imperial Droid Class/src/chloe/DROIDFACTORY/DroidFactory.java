package chloe.DROIDFACTORY;

public class DroidFactory {
	private String IDNumber;
	private String BuildType;
	
	public DroidFactory(String IDNumber, String BuildType) {
		this.IDNumber=IDNumber;
		this.BuildType=BuildType;
	}
	
	public void displayInfo() {
		System.out.println("Imperial Droid Factory:");
		System.out.println("\tID Number:"+this.IDNumber+"\tBuild Type:"+this.BuildType);
		
	}

}
