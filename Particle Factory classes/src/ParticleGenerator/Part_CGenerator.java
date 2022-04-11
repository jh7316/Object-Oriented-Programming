package ParticleGenerator;

import Particle.C_Particle;
import SUPPORT.Location;

public class Part_CGenerator extends ParticleGenerator{
	public static final String PTYPE="C_Particle";
	public static final int PCAPACITY=210;
	public static int GENERATED_COUNT=0;
	
	public Part_CGenerator(String pGeneratorID,Location pGeneratorPos) {
		super(pGeneratorID,pGeneratorPos);
		
	}
	
	public C_Particle generateParticle() {
		String retrievalcode="C"+this.GENERATED_COUNT;
		C_Particle temp=new C_Particle(retrievalcode);
		return temp;
		
	}

}
