package chloe.DROIDS;


public class SentryDroid_B extends ImperialDroid {
	
	private static final String DroidType = "Beta";
	
	public SentryDroid_B(String DroidID) {
	    super(DroidID,DroidType);
		
	}
	
	public void displaySDB() {
		System.out.println("Imperial Droid: SentryDroid_B\tID Number: "+this.getDroidID()+"\tDroid Type: "+this.DroidType);
		this.displayInfo();
		
	}

}
