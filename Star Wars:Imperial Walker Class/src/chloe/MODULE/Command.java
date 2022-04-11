package chloe.MODULE;

import chloe.ARMAMENT.*;
import chloe.ENUMS.*;

public class Command extends Module {
	
	private static final String type = "Command";
	private WeaponPlatform LeftWpns;
	private WeaponPlatform RightWpns;
	private Crewman driver;
	private Crewman cmdr;
	private Crewman gunner;
	

	public Command(String walkerType) {
		super(type);
		this.setLength(5);
		this.setHeight(4);
		this.setWidth((int)4.2);
		this.setMass(5);
	
	}
	
	

	public WeaponPlatform getLeftWpns() {
		return LeftWpns;
	}



	public void setLeftWpns(WeaponPlatform leftWpns) {
		LeftWpns = leftWpns;
	}



	public WeaponPlatform getRightWpns() {
		return RightWpns;
	}



	public void setRightWpns(WeaponPlatform rightWpns) {
		RightWpns = rightWpns;
	}



	public Crewman getDriver() {
		return driver;
	}



	public void setDriver(Crewman driver) {
		this.driver = driver;
	}



	public Crewman getCmdr() {
		return cmdr;
	}



	public void setCmdr(Crewman cmdr) {
		this.cmdr = cmdr;
	}



	public Crewman getGunner() {
		return gunner;
	}



	public void setGunner(Crewman gunner) {
		this.gunner = gunner;
	}






	@Override
	public void showSpecs() {
		// TODO Auto-generated method stub
		
	}

}