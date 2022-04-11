package Particle;

import INTERFACES.Scatterable;
import SUPPORT.Mineral;

public abstract class Particle implements Scatterable {
	private String retrievalCode;
	private double pDiameter;
	private double pVolume;
	private double pSurfaceArea;
	private Mineral pComposition;
	private boolean isRefined;
	private static int particleCount=0;
	
	public Particle(String retrievalCode, double pDiameter,double pVolume, double pSurfaceArea, Mineral pComposition) {
		this.retrievalCode=retrievalCode;
		this.pDiameter=pDiameter;
		this.pVolume=pVolume;
		this.pSurfaceArea=pSurfaceArea;
		this.pComposition=pComposition;
		
		this.particleCount+=1;
	}
	
	
	
	public String getRetrievalCode() {
		return retrievalCode;
	}



	public void setRetrievalCode(String retrievalCode) {
		this.retrievalCode = retrievalCode;
	}



	public double getpDiameter() {
		return pDiameter;
	}



	public void setpDiameter(double pDiameter) {
		this.pDiameter = pDiameter;
	}



	public double getpVolume() {
		return pVolume;
	}



	public void setpVolume(double pVolume) {
		this.pVolume = pVolume;
	}



	public double getpSurfaceArea() {
		return pSurfaceArea;
	}



	public void setpSurfaceArea(double pSurfaceArea) {
		this.pSurfaceArea = pSurfaceArea;
	}



	public Mineral getpComposition() {
		return pComposition;
	}



	public void setpComposition(Mineral pComposition) {
		this.pComposition = pComposition;
	}



	public boolean isRefined() {
		return isRefined;
	}



	public void setRefined(boolean isRefined) {
		this.isRefined = isRefined;
	}



	public static int getParticleCount() {
		return particleCount;
	}



	public static void setParticleCount(int particleCount) {
		Particle.particleCount = particleCount;
	}



	public void displayParticleInfo() {
		System.out.println("Particle:");
		System.out.println("\tRetrieval Code: "+this.retrievalCode);
		System.out.println("\tPhysical Info:");
		System.out.println("\t\tDiameter: "+this.pDiameter);
		System.out.println("\t\tVolume: "+this.pVolume);
		System.out.println("\t\tSurface Area: "+this.pSurfaceArea);
		System.out.println("\t\tMineral Composition: "+this.pComposition);
		System.out.println("\tParticle Count: "+this.particleCount);
		System.out.println("");
		if(this.isRefined) {
			System.out.println("\tThis particle is refined.");
		}else {
			System.out.println("\tThis particle is not refined.");
		}
		System.out.println("");
		
		
		
	}







	



	









}
