package chloe.MODULE;

import java.util.ArrayList;

import chloe.ENUMS.*;

public class Transport extends Module {
	
	private static final String type = "Transport";
	private AccessRamp ramp;
	private ArrayList<Stormtrooper> troops;
	
	public Transport(String walkerType) {
		  super(type);
		  this.setLength(15);
		  this.setHeight(8);
		  this.setWidth(5);
		  this.setMass(17);
	}

	public AccessRamp getRamp() {
		return ramp;
	}

	public void setRamp(AccessRamp ramp) {
		this.ramp = ramp;
	}

	public ArrayList<Stormtrooper> getTroops() {
		return troops;
	}

	public void setTroops(ArrayList<Stormtrooper> troops) {
		this.troops = troops;
	}


	@Override
	public void showSpecs() {
		// TODO Auto-generated method stub
		
	}
	
	

}
