package chloe.MAIN;

import chloe.DROIDFACTORY.*;
import chloe.DROIDS.*;

public class chloe_ImperialDroid {
	
	public static void main(String[] args) {
		
		//create new factory: Sentry_AFactory with 3 new SentryDroid_A objects, and display their info
		Sentry_AFactory first= new Sentry_AFactory("Chloe A_Factory 1");
		SentryDroid_A[] Agroup=first.buildDroids_A(3);
		first.displayDroids(Agroup);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		//create individual object: SentryDroid_B
		SentryDroid_B b=new SentryDroid_B("Chloe Droid_B 1");
		b.displaySDB();
		//rundiagnostic method on b 
		System.out.println("");
		b.runDiagnostic();
		
	}

}
