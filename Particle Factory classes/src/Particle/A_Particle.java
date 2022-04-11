package Particle;

import SUPPORT.Mineral;
import java.lang.Math;

public class A_Particle extends Particle {
	
	public static int AParticleCount=0;
	
	public A_Particle(String retrievalCode) {
		super(retrievalCode,1.3,124,7,Mineral.DILITHIUM);
		this.setRefined(false);
		AParticleCount+=1;
	}
	
	public double scatterLight() {
		double temp=this.getpComposition().getStrength()*Math.sqrt(10)*0.28*this.getpComposition().getMass();
		
		return temp;
		}
	
	

}
