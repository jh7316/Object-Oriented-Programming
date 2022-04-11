package chloe.DROIDS;


public class SentryDroid_C extends ImperialDroid {
	
	private static final String DroidType = "Gamma";
	
	public SentryDroid_C(String DroidID) {
	    super(DroidID,DroidType);
		
	}
	
	public void displaySDC() {
		System.out.println("Imperial Droid: SentryDroid_C\tID Number: "+this.getDroidID()+"\tDroid Type: "+this.DroidType);
		this.displayInfo();
		
	}

}
