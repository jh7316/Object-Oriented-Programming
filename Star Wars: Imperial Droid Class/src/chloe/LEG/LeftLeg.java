package chloe.LEG;

public class LeftLeg extends Leg{
	private static final String LType="Left Leg";
	private boolean Operational=true;
	
	public LeftLeg(String IDNumber) {
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
