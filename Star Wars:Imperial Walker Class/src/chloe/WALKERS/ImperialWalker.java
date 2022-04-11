package chloe.WALKERS;

import java.util.TreeMap;

import chloe.INTERFACES.Combatable;
import chloe.INTERFACES.Moveable;
import chloe.INTERFACES.Transportable;
import chloe.MODULE.*;
import chloe.SUPPORT.*;

public abstract class ImperialWalker implements Moveable, Combatable, Transportable{
	
	private String type;
	private String idNumber;
	private int height;
	private int width;
	private int weight;
	private int length;
	private int mass;
	private int TroopCapacity;
	private Position currentPosition;
	private Command cmdModule;
	private Transport cargoModule;
	private TreeMap<String,RearLeg> aftLeg;
	private TreeMap<String,ForwardLeg> fwdLeg;
	
	
	public ImperialWalker(String type, String idNumber) {
		this.type= type;
		this.idNumber=idNumber;
		
		
		
	}
	
	
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}

	
	
	public int getWidth() {
		return width;
	}




	public void setWidth(int width) {
		this.width = width;
	}




	public void setWeight(int weight) {
		this.weight = weight;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getMass() {
		return mass;
	}


	public void setMass(int mass) {
		this.mass = mass;
	}


	public int getTroopCapacity() {
		return TroopCapacity;
	}


	public void setTroopCapacity(int troopCapacity) {
		TroopCapacity = troopCapacity;
	}


	public Position getCurrentPosition() {
		return currentPosition;
	}


	public void setCurrentPosition(Position currentPosition) {
		this.currentPosition = currentPosition;
	}


	public Command getCmdModule() {
		return cmdModule;
	}


	public void setCmdModule(Command cmdModule) {
		this.cmdModule = cmdModule;
	}


	public Transport getCargoModule() {
		return cargoModule;
	}


	public void setCargoModule(Transport cargoModule) {
		this.cargoModule = cargoModule;
	}


	public TreeMap<String, RearLeg> getAftLeg() {
		return aftLeg;
	}


	public void setAftLeg(TreeMap<String, RearLeg> aftLeg) {
		this.aftLeg = aftLeg;
	}


	public TreeMap<String, ForwardLeg> getFwdLeg() {
		return fwdLeg;
	}


	public void setFwdLeg(TreeMap<String, ForwardLeg> fwdLeg) {
		this.fwdLeg = fwdLeg;
	}



	

	public void displayWalkerSpecs() {
		System.out.println("IMPERIAL WALKER: "+this.type+" ID Number: "+this.idNumber);
		this.currentPosition.displayPosition();
		
		System.out.println("Specifications:");
		System.out.println("\tLength: "+this.length+" meters");
		System.out.println("\tWidth: "+this.width+" meters");
		System.out.println("\tHeight: "+this.height+" meters");
		System.out.println("\tMass: "+this.mass+" tons");
		
		System.out.println("Troop Capacity:");
		System.out.println("\tTroops Onboard: "+this.TroopCapacity+" troopers");
		
		System.out.println("Armament");
		System.out.println("\tLEFT: class chloe.ARMAMENT.LaserCannon");
		System.out.println("\tLEFT: class chloe.ARMAMENT.HeavyBlaster");
		System.out.println("\tRIGHT: class chloe.ARMAMENT.LaserCannon");
		System.out.println("\tRIGHT: class chloe.ARMAMENT.HeavyBlaster");
		
	    
		
		
		
		
		
	}
	

}
