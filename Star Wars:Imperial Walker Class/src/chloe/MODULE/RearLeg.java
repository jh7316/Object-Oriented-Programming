package chloe.MODULE;

import chloe.COMPONENTS.*;
import chloe.ENUMS.*;

public class RearLeg extends Module {
	
	private static final String type = "Rear Leg";
	private Side legSide;
	private UpperLeg uprLeg;
	private LowerLeg lwrLeg;
	private FootPad pad;

	public RearLeg(String side) {
		super(type);
		
		this.setLength(3);
		this.setHeight(8);
		this.setWidth(2);
		this.setMass(6);
	}

	@Override
	public void showSpecs() {
		// TODO Auto-generated method stub
		
	}
	
	

}
