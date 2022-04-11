package ParticleCollector;

import SUPPORT.Location;

import java.util.ArrayList;

import Particle.Particle;

public class ParticleCollector {
	private String collectorID;
	private Location collectorPOS;
	private ArrayList<Particle> collectorPool;
    public static final int COLLECTOR_CAPACITY=500;
	
	public ParticleCollector(String collectorID,Location collectorPOS) {
		this.collectorID=collectorID;
		this.collectorPOS=collectorPOS;
		this.collectorPool=new ArrayList<Particle>();
	}
	
	
	
	public String getCollectorID() {
		return collectorID;
	}



	public void setCollectorID(String collectorID) {
		this.collectorID = collectorID;
	}



	public Location getCollectorPOS() {
		return collectorPOS;
	}



	public void setCollectorPOS(Location collectorPOS) {
		this.collectorPOS = collectorPOS;
	}



	public ArrayList<Particle> getCollectorPool() {
		return collectorPool;
	}



	public void setCollectorPool(ArrayList<Particle> collectorPool) {
		this.collectorPool = collectorPool;
	}



	public static int getCollectorCapacity() {
		return COLLECTOR_CAPACITY;
	}



	public boolean collectoParticle(Particle p) {
		if(this.collectorPool.size()<500) {
			this.collectorPool.add(p);
			return true;
		}else {
			return false;
		}
	}

}
