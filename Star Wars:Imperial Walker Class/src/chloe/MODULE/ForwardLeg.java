package chloe.MODULE;

import chloe.COMPONENTS.*;
import chloe.ENUMS.*;


public class ForwardLeg extends Module{
	
	private static final String type = "Forward Leg";
	private Side legSide;
	private UpperLeg uprLeg;
	private LowerLeg lwrLeg;
	private FootPad pad;

	public ForwardLeg(String side) {
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
