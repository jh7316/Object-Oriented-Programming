package ParticleExtractor;

import java.util.ArrayList;

import Particle.Particle;
import ParticleCollector.ParticleCollector;
import SUPPORT.Location;

public class ParticleExtractor {
	private String extractorID;
	private Location extractorPOS;
	private ArrayList<Particle> extractorPool;
	public static final int EXTRACTOR_CAPACITY=500;
	
	public ParticleExtractor(String extractorID,Location extractorPOS) {
		this.extractorID=extractorID;
		this.extractorPOS=extractorPOS;
		this.extractorPool=new ArrayList<Particle>();
	}
	
	
	
	public String getExtractorID() {
		return extractorID;
	}



	public void setExtractorID(String extractorID) {
		this.extractorID = extractorID;
	}



	public Location getExtractorPOS() {
		return extractorPOS;
	}



	public void setExtractorPOS(Location extractorPOS) {
		this.extractorPOS = extractorPOS;
	}



	public ArrayList<Particle> getExtractorPool() {
		return extractorPool;
	}



	public void setExtractorPool(ArrayList<Particle> extractorPool) {
		this.extractorPool = extractorPool;
	}



	public static int getExtractorCapacity() {
		return EXTRACTOR_CAPACITY;
	}



	public boolean extractParticles(ParticleCollector pc) {
		if(this.extractorPool.size()+pc.getCollectorPool().size()<=this.EXTRACTOR_CAPACITY) {
			this.extractorPool.addAll(pc.getCollectorPool());
			return true;
			
		}else {
			System.out.println("Extractor Pool does not have sufficient capacity");
			return false;
		}
		
	}
	

}
