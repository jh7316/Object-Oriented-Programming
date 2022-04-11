package chloe.BODY;

public class Cranial extends Body{
	private static final String BType="Cranial";
	private boolean Operational = true;
	
	public Cranial(String IDNumber) {
		super(IDNumber,BType);
	}

	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean operational) {
		Operational = operational;
	}

	public static String getBtype() {
		return BType;
	}


	
	
	
	

}
