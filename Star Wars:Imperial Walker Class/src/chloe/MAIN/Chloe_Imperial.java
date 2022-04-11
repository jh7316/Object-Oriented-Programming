package chloe.MAIN;

import java.util.ArrayList;

import chloe.ENUMS.Stormtrooper;
import chloe.SUPPORT.*;
import chloe.WALKERS.ATAT;

public class Chloe_Imperial {
	
	public static void main(String[] args) {
		ATAT x = new ATAT("Chloe Imperial 1");
			Position hoth = new Position("Hoth",new Location(10,10,10));
			Position rebelBase = new Position("Rebel Base", new Location(15,20,10));
		x.setCurrentPosition(hoth);
		x.displayWalkerSpecs();
		x.moveToPosition(rebelBase);
		
		System.out.println();
			ArrayList<Stormtrooper> st = new ArrayList<>();
				st.add(Stormtrooper.Standard);
				st.add(Stormtrooper.Assault);
				st.add(Stormtrooper.Scout);
		x.embarkTroopers(st);
		
		System.out.println();
		x.displayWalkerSpecs();
		
		System.out.println();
		x.disembarkTroopers();
		x.rollCall();
			
		
	}

}
