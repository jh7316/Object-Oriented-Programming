package chloe.ARMAMENT;

import chloe.SUPPORT.Target;

public class WeaponPlatform {
	private String type;
	private LaserCannon laser;
	private HeavyBlaster blaster;
	
	public WeaponPlatform(String type) {
		this.type=type;
	}
	
	public void fireCannon(Target T) {
		this.laser.fire();
	}
	
	public void fireBlaster(Target T) {
		this.blaster.fire();
		
		
		
		
	}

}
