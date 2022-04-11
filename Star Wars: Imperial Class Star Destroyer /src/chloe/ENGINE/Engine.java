package chloe.ENGINE;

import chloe.HULL.AftHullSection;
import chloe.HULL.FwdHullSection;

public class Engine {
	
	private String IDNumber;
	private ShipEngine[] Engines;
	private String StarDestroyerType;
	
	public Engine(String iDNumber, String starDestroyerType) {
		IDNumber = iDNumber;
		StarDestroyerType=starDestroyerType;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public ShipEngine[] getEngines() {
		return Engines;
	}

	public void setEngines(ShipEngine[] engines) {
		Engines = engines;
	}
	
	public void displayEngineSpecs() {
		System.out.println("______ENGINE SPECIFICATIONS");
		System.out.println("Engine Number: "+this.IDNumber);
		System.out.println("\t\t\t\tLength\tHeight\tPower\t\tWeight");
		
		ShipEngine[] tempeng=new ShipEngine[3];
		tempeng[0]=new Engine_S(this.StarDestroyerType);
		tempeng[2]=new Engine_S(this.StarDestroyerType);
		tempeng[1]=new Engine_C(this.StarDestroyerType);
		
		this.setEngines(tempeng);
	
		
		
		
		System.out.println("Engine S1:\t\t\t"+this.getEngines()[0].getLength()+"\t"
				+this.getEngines()[0].getHeight()+"\t"+this.getEngines()[0].getPower()+"\t\t"
				+this.getEngines()[0].getWeight());
		
		System.out.println("Engine C:\t\t\t"+this.getEngines()[1].getLength()+"\t"
				+this.getEngines()[1].getHeight()+"\t"+this.getEngines()[1].getPower()+"\t"
				+this.getEngines()[1].getWeight());
		
		System.out.println("Engine S2:\t\t\t"+this.getEngines()[2].getLength()+"\t"
				+this.getEngines()[2].getHeight()+"\t"+this.getEngines()[2].getPower()+"\t\t"
				+this.getEngines()[2].getWeight());
		
	}
	
	

}
