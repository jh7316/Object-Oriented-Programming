package ParticleGenerator;

import Particle.A_Particle;
import SUPPORT.Location;

public class Part_AGenerator extends ParticleGenerator{
	public static final String PTYPE="A_Particle";
	public static final int PCAPACITY=100;
	public static int GENERATED_COUNT=0;
	
	public Part_AGenerator(String pGeneratorID,Location pGeneratorPos) {
		super(pGeneratorID,pGeneratorPos);
		
	}
	
	public A_Particle generateParticle() {
		String retrievalcode="A"+this.GENERATED_COUNT;
		A_Particle temp=new A_Particle(retrievalcode);
		
		this.GENERATED_COUNT+=1;
		return temp;
		
	}

}
