package chloe.ISD;

public class Imperial_I extends StarDestroyer{
	
	
	public Imperial_I() {
		super();
	}

	public Imperial_I(String shpNumber, String shpName) {
		super(shpNumber, shpName);
		this.setShpClass("Imperial_I");
		this.setShpCrew(9000);
		
	}

	@Override
	public void navigatesToPosition(String p) {
		// TODO Auto-generated method stub
		
	}

}
