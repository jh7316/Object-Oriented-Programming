package chloe.DROIDS;

import chloe.BODY.*;
import chloe.LEG.*;

import java.util.TreeMap;

import chloe.ARM.*;

public class ImperialDroid {
	private String DroidID;
	private String DroidType;
	private Cranial Head;
	private Torso UpperTorso;
	private TreeMap<String,Arm> Arms;
	private TreeMap<String, Leg> Legs;
	
	public ImperialDroid(String DroidID, String DroidType) {
		this.DroidID=DroidID;
		this.DroidType=DroidType;
		
		this.Head= new Cranial("x");
		this.UpperTorso=new Torso("x");
		this.Arms=new TreeMap<>();
		
		this.Arms.put("Left", new LeftArm("x"));
		this.Arms.put("Right", new RightArm("x"));
		
		this.Legs=new TreeMap<>();
		
		this.Legs.put("Left", new LeftLeg("x"));
		this.Legs.put("Right", new RightLeg("x"));
		
		
		
		
	}
	
	
	
	public String getDroidID() {
		return DroidID;
	}



	public void setDroidID(String droidID) {
		DroidID = droidID;
	}



	public String getDroidType() {
		return DroidType;
	}



	public void setDroidType(String droidType) {
		DroidType = droidType;
	}



	public Cranial getHead() {
		return Head;
	}



	public void setHead(Cranial head) {
		Head = head;
	}



	public Torso getUpperTorso() {
		return UpperTorso;
	}



	public void setUpperTorso(Torso upperTorso) {
		UpperTorso = upperTorso;
	}



	public TreeMap<String, Arm> getArms() {
		return Arms;
	}



	public void setArms(TreeMap<String, Arm> arms) {
		Arms = arms;
	}



	public TreeMap<String, Leg> getLegs() {
		return Legs;
	}



	public void setLegs(TreeMap<String, Leg> legs) {
		Legs = legs;
	}



	public void displayInfo() {
		
		this.Head.displayInfo();
		this.UpperTorso.displayInfo();
		
		this.Arms.get("Left").displayInfo();
		this.Arms.get("Right").displayInfo();
		this.Legs.get("Left").displayInfo();
		this.Legs.get("Right").displayInfo();
		
		
		
	}
	
	
	//the return type of this method is void according to slide 3,
	//but slide 8 tells us to return a true or false value so I changed the type to boolean.
	public boolean runDiagnostic() {
		if(this.Head.isOperational()&&this.UpperTorso.isOperational()
		&& ((LeftArm) this.Arms.get("Left")).isOperational()&&((RightArm) this.Arms.get("Right")).isOperational()
		&& ((LeftLeg) this.Legs.get("Left")).isOperational()&&((RightLeg) this.Legs.get("Right")).isOperational()) {
			System.out.println(this.DroidID+" is Fully Operational");
			return true;
			
			
		}else {
			System.out.println(this.DroidID+" Malfunction");
			return false;
		}
		
		
	}
	
	
	
}
