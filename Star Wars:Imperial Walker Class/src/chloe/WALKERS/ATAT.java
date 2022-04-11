package chloe.WALKERS;

import java.util.ArrayList;

import chloe.ENUMS.*;
import chloe.MODULE.*;
import chloe.SUPPORT.*;

public class ATAT extends ImperialWalker{
	
	private static final String ATATBattleCode="Heavy_AT";
	
	public ATAT(String IdNumber) {
		super("ATAT",IdNumber);
		
		this.setLength(20);
		this.setWidth(5);
		this.setHeight(16);
		this.setMass(46);
		
		this.setTroopCapacity(0);
		
	    this.setCmdModule(new Command("ATAT"));
		this.setCargoModule(new Transport("ATAT"));
		
		
		
		
		
	}
	
	public void moveToPosition(Position P) {
		this.setCurrentPosition(P);
		
		
	}
	
	public void embarkTroopers(ArrayList<Stormtrooper> S) {
		this.getCargoModule().setTroops(S);
		this.setTroopCapacity(this.getCargoModule().getTroops().size());
		System.out.println(this.getTroopCapacity()+" Stormtrooper Onboard");
		
		
	}
	
	public void disembarkTroopers() {
		this.getCargoModule().setTroops(new ArrayList<Stormtrooper>());
		System.out.println("All Stormtroopers off loaded");
		
		
		
	}
	
	public void rollCall() {
		System.out.println(this.getCargoModule().getTroops().size()+" Stormtroopers currently onboard");
		
		
	}
	
	public void fireLaserCannons(Target T) {
		this.getCmdModule().getLeftWpns().fireCannon(T);
		this.getCmdModule().getRightWpns().fireCannon(T);
		
		
	}
	
	public void fireHeavyBlasters(Target T) {
		this.getCmdModule().getLeftWpns().fireBlaster(T);
		this.getCmdModule().getRightWpns().fireBlaster(T);
		
	}
	
	public void assaultPosition(Position P) {
	    this.moveToPosition(P);
	    P.displayPosition();
		
	}





	









	

}
