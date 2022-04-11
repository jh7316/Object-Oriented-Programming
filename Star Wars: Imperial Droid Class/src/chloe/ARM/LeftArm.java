package chloe.ARM;

public class LeftArm extends Arm{
	private static final String AType="Left Arm";
	private boolean Operational = true;
	
	public LeftArm(String IDNumber) {
		super(IDNumber, AType);
	}

	
	public boolean isOperational() {
		return Operational;
	}

	public void setOperational(boolean operational) {
		Operational = operational;
	}

	public static String getAtype() {
		return AType;
	}
	
	
	

}
