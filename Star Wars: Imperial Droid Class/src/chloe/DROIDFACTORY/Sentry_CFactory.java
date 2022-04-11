package chloe.DROIDFACTORY;

import chloe.DROIDS.SentryDroid_A;
import chloe.DROIDS.SentryDroid_C;

public class Sentry_CFactory extends DroidFactory{
	private static final String BuildType="Gamma Droids";
	
	public Sentry_CFactory(String IDNumber) {
		super(IDNumber,BuildType);
		
	}
	
	public SentryDroid_C[] buildDroids_C(int count) {
		SentryDroid_C[] temp = new SentryDroid_C[count];
		for(int i=0;i<count;i++) {
			temp[i]=new SentryDroid_C("x");
			
		}
		return temp;
		
	}
	
	public static void displayDroids(SentryDroid_C[] dl) {
		for(int i=0;i<dl.length;i++) {
			dl[i].displaySDC();
			System.out.println("");
		}
		
		
	}

}
