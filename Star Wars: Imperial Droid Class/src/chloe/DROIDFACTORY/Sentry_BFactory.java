package chloe.DROIDFACTORY;

import chloe.DROIDS.SentryDroid_A;
import chloe.DROIDS.SentryDroid_B;

public class Sentry_BFactory extends DroidFactory{
	private static final String BuildType="Beta Droids";
	
	public Sentry_BFactory(String IDNumber) {
		super(IDNumber,BuildType);
		
	}
	
	public SentryDroid_B[] buildDroids_B(int count) {
		SentryDroid_B[] temp = new SentryDroid_B[count];
		for(int i=0;i<count;i++) {
			temp[i]=new SentryDroid_B("x");
			
		}
		return temp;
	}
	
	public static void displayDroids(SentryDroid_B[] dl) {
		for(int i=0;i<dl.length;i++) {
			dl[i].displaySDB();
			System.out.println("");
		}
		
	}

}
