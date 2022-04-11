package chloe.MAIN;

import chloe.DECK.Deck;
import chloe.ENGINE.Engine;
import chloe.HULL.Hull;
import chloe.ISD.Imperial_I;
import chloe.ISD.Imperial_II;
import chloe.ISD.StarDestroyer;

public class ISD_Me {
	public static void main(String[] args) {
		Imperial_I Imp = new Imperial_I("ISD_001","Avenger");
		Hull Imp_Hull = new Hull("H1","Imperial_I");
		Deck Imp_Deck = new Deck("D1","Imperial_I");
		Engine Imp_Engine = new Engine("E1","Imperial_I");
		
		Imp.displayShipInfo();
		System.out.println("");
		
		Imp_Hull.displayHullSpecs();
		System.out.println("");
		Imp_Deck.displayDeckSpecs();
		System.out.println("");
		Imp_Engine.displayEngineSpecs();
		System.out.println("");
		
		System.out.println("");
		System.out.println("");
		
		
		Imperial_II Imp_2 = new Imperial_II("ISD_002","Devastator");
		Hull Imp_2_Hull = new Hull("H1","Imperial_II");
		Deck Imp_2_Deck = new Deck("D1","Imperial_II");
		Engine Imp_2_Engine = new Engine("E1","Imperial_II");
		
		Imp_2.displayShipInfo();
		System.out.println("");
		
		Imp_2_Hull.displayHullSpecs();
		System.out.println("");
		Imp_2_Deck.displayDeckSpecs();
		System.out.println("");
		Imp_2_Engine.displayEngineSpecs();
		System.out.println("");
		
		
		
		
		
	}

}
