package chloe.LEG;

public class RightLeg extends Leg{
	private static final String LType="Right Leg";
	private boolean Operational=true;
	
	public RightLeg(String IDNumber) {
		super(IDNumber,LType);
	}

	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean operational) {
		Operational = operational;
	}

	public static String getLtype() {
		return LType;
	}
	
	


	
	

}
