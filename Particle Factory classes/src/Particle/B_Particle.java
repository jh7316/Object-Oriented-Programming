package Particle;

import SUPPORT.Mineral;
import java.lang.Math;

public class B_Particle extends Particle {
	
	public static int BParticleCount=0;
	
	public B_Particle(String retrievalCode) {
		super(retrievalCode,1.7,396,18,Mineral.TRITANIUM);
		this.setRefined(false);
		BParticleCount+=1;
	}
	
	public double scatterLight() {
		double temp=this.getpComposition().getStrength()*Math.sqrt(10);
		
		return temp;
		}
	
	

}
