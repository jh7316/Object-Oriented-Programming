package chloe.BODY;

public class Torso extends Body{
	private static final String BType="Torso";
	private boolean Operational = true;
	
	public Torso(String IDNumber) {
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
