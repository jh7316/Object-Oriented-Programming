package ParticleRefiner;

import java.util.ArrayList;

import INTERFACES.Refinable;
import Particle.A_Particle;
import Particle.B_Particle;
import Particle.C_Particle;
import Particle.Particle;
import ParticleExtractor.ParticleExtractor;
import SUPPORT.Location;

import java.lang.*;

public class ParticleRefiner implements Refinable{
	
	public String refinerID;
	public String refinerName;
	public Location refinerPos;
	public ArrayList<Particle> pStorage;
	public ArrayList<A_Particle> Refined_AStorage;
	public ArrayList<B_Particle> Refined_BStorage;
	public ArrayList<C_Particle> Refined_CStorage;
	
	public ParticleRefiner(String refinerID, String refinerName, Location refinerPos) {
		this.refinerID=refinerID;
		this.refinerName=refinerName;
		this.refinerPos=refinerPos;
		this.pStorage=new ArrayList<Particle>();
		this.Refined_AStorage=new ArrayList<A_Particle>();
		this.Refined_BStorage=new ArrayList<B_Particle>();
		this.Refined_CStorage=new ArrayList<C_Particle>();
		
	}
	
	public A_Particle refineAParticle(A_Particle p) {
		p.setRefined(true);
		return p;
		
		
	}
	
	public B_Particle refineBParticle(B_Particle p) {
		p.setRefined(true);
		return p;
		
	}
	
	public C_Particle refineCParticle(C_Particle p) {
		p.setRefined(true);
		return p;
	}
	
	public boolean emptyExtractor(ParticleExtractor pe) {
		this.pStorage.addAll(pe.getExtractorPool());
		for(int i=0;i<this.pStorage.size();i++) {
			if(this.pStorage.get(i).getRetrievalCode().indexOf("A")!=-1) {
				//it wasn't specified in instruction on the slides, but it made sense to me 
			    //to refine the particles before they are stored in the refined (A,B,C) storage.
				this.Refined_AStorage.add(this.refineAParticle((A_Particle) this.pStorage.get(i) ));
				
			}else if(this.pStorage.get(i).getRetrievalCode().indexOf("B")!=-1) {
				this.Refined_BStorage.add(this.refineBParticle((B_Particle) this.pStorage.get(i)));
				
			}else if(this.pStorage.get(i).getRetrievalCode().indexOf("C")!=-1) {
				this.Refined_CStorage.add(this.refineCParticle((C_Particle) this.pStorage.get(i)));
				
			}
		}
		
		if(this.Refined_AStorage.size()+this.Refined_BStorage.size()+this.Refined_CStorage.size()
				==this.pStorage.size()) {
			return true;
		}else {
			return false;
		}
		
		
		
	}
	
	public void sampleParticles(int count) {
		for(int i=0;i<count;i++) {
			this.pStorage.get(i).displayParticleInfo();
		}
		
		
		
	}
	
	public void displayInfo() {
		System.out.println("Particle Refiner:");
		System.out.println("\tID: "+this.refinerID+"\tName: "+this.refinerName);
		System.out.println("\tRefiner Position: \t"+this.refinerPos.toString());
		System.out.println("\tTotal Particles in refined storage: "+this.pStorage.size());
		System.out.println("\t\tTotal Particles in refined A storage: "+this.Refined_AStorage.size());
		System.out.println("\t\tTotal Particles in refined B storage: "+this.Refined_BStorage.size());
		System.out.println("\t\tTotal Particles in refined C storage: "+this.Refined_CStorage.size());
		
	}


	
	
	
	
	

}
