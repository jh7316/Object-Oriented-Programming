package chloe.ARMAMENT;

public class LaserCannon {
	
	private int maxRange;
	private int ammoCapacity;
	private int currentAmmo;
	
	public LaserCannon() {
		
	}
	
	
	
	public int getMaxRange() {
		return maxRange;
	}



	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
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
			System.out.println("Firing Laser Cannon*");
			this.setCurrentAmmo(this.currentAmmo-1);
			return true;
			
		}else {
			System.out.println("Ammunition Expended");
			return false;
		}
		
	}
	
	public boolean rapidFire() {
		if(this.currentAmmo>3) {
			System.out.println("Firing Laser Cannon***");
			this.setCurrentAmmo(this.currentAmmo-3);
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
