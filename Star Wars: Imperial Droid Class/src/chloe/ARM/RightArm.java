package chloe.ARM;

public class RightArm extends Arm{
	private static final String AType="Right Arm";
	private boolean Operational = true;
	
	public RightArm(String IDNumber) {
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
