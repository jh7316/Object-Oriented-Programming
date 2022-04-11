package chloe.DROIDS;


public class SentryDroid_A extends ImperialDroid {
	
	private static final String DroidType = "Alpha";
	
	public SentryDroid_A(String DroidID) {
	    super(DroidID,DroidType);
		
	}
	
	public void displaySDA() {
		System.out.println("Imperial Droid: SentryDroid_A\tID Number: "+this.getDroidID()+"\tDroid Type: "+this.DroidType);
		this.displayInfo();
	}

}
