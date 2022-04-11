package chloe.ARMAMENT;

public class HeavyBlaster {
	private int maxRange;
	private int minRange;
	private int ammoCapacity;
	private int currentAmmo;
	
	public HeavyBlaster() {
		
		
		
	}
	
	
	public int getMaxRange() {
		return maxRange;
	}


	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}


	public int getMinRange() {
		return minRange;
	}


	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}


	public int getAmmoCapacity() {
		return ammoCapacity;
	}


	public void setAmmoCapacity(int ammoCapacity) {
		this.ammoCapacity = ammoCapacity;
	}


	public int getCurrentAmmo() {
		return currentAmmo;
	}


	public void setCurrentAmmo(int currentAmmo) {
		this.currentAmmo = currentAmmo;
	}


	public boolean fire() {
		if(this.currentAmmo>1) {
			System.out.println("Firing Heavy Blaster");
			this.setCurrentAmmo(this.currentAmmo-1);
			return true;
			
		}else {
			System.out.println("Ammunition Expended");
			return false;
		}
		
	}
	
	public boolean reload() {
		this.setCurrentAmmo(this.ammoCapacity);
		return true;
		
	}

}
