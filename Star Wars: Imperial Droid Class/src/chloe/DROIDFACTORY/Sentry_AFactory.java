package chloe.DROIDFACTORY;

import chloe.DROIDS.SentryDroid_A;

public class Sentry_AFactory extends DroidFactory{
	private static final String BuildType="Alpha Droids";
	
	public Sentry_AFactory(String IDNumber) {
		super(IDNumber,BuildType);
		
	}
	
	public SentryDroid_A[] buildDroids_A(int count) {
		SentryDroid_A[] temp = new SentryDroid_A[count];
		for(int i=0;i<count;i++) {
			temp[i]=new SentryDroid_A("x");
			
		}
		return temp;
		
	}
	
	public static void displayDroids(SentryDroid_A[] dl) {
		for(int i=0;i<dl.length;i++) {
			dl[i].displaySDA();
			System.out.println("");
		}
		
	}

}
