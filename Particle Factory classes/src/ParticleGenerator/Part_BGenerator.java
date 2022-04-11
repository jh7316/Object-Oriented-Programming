package ParticleGenerator;

import Particle.B_Particle;
import SUPPORT.Location;

public class Part_BGenerator extends ParticleGenerator{
	public static final String PTYPE="B_Particle";
	public static final int PCAPACITY=180;
	public static int GENERATED_COUNT=0;
	
	public Part_BGenerator(String pGeneratorID,Location pGeneratorPos) {
		super(pGeneratorID,pGeneratorPos);
		
	}
	
	public B_Particle generateParticle() {
		String retrievalcode="B"+this.GENERATED_COUNT;
		B_Particle temp=new B_Particle(retrievalcode);
		return temp;
		
	}

}
