package chloe.ISD;

public class Imperial_II extends StarDestroyer {
	
	public Imperial_II() {
		super();
	}

	public Imperial_II(String shpNumber, String shpName) {
		super(shpNumber, shpName);
		this.setShpClass("Imperial_II");
		this.setShpCrew(12000);
		
	}

	@Override
	public void navigatesToPosition(String p) {
		// TODO Auto-generated method stub
		
	}

}
