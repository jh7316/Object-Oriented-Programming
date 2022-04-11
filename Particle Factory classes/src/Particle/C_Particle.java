package Particle;

import SUPPORT.Mineral;
import java.lang.Math;

public class C_Particle extends Particle {
	
	public static int CParticleCount=0;
	
	public C_Particle(String retrievalCode) {
		super(retrievalCode,2.1,518,24,Mineral.UNAMIUM);
		this.setRefined(false);
		CParticleCount+=1;
	}
	
	public double scatterLight() {
		double temp=this.getpComposition().getMass()*10;
		
		return temp;
		}
	
	

}
