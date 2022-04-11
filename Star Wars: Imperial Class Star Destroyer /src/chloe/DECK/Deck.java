package chloe.DECK;

import chloe.HULL.FwdHullSection;

public class Deck {
	
	private String IDNumber;
	private Bridge Deck_Bridge;
	private TopDeck Deck_Top;
	private MainDeck Deck_Main;
	private String StarDestroyerType;
	
	
	public Deck(String iDNumber, String starDestroyerType) {
		IDNumber = iDNumber;
		StarDestroyerType= starDestroyerType;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	public Bridge getDeck_Bridge() {
		return Deck_Bridge;
	}

	public void setDeck_Bridge(Bridge deck_Bridge) {
		Deck_Bridge = deck_Bridge;
	}

	public TopDeck getDeck_Top() {
		return Deck_Top;
	}

	public void setDeck_Top(TopDeck deck_Top) {
		Deck_Top = deck_Top;
	}

	public MainDeck getDeck_Main() {
		return Deck_Main;
	}

	public void setDeck_Main(MainDeck deck_Main) {
		Deck_Main = deck_Main;
	}
	
	public void displayDeckSpecs() {
		System.out.println("______DECK SPECIFICATIONS");
		System.out.println("Deck Number: "+this.IDNumber);
		System.out.println("\t\t\t\tLength\tHeight\tPower\tWeight");
		
		this.setDeck_Bridge(new Bridge(this.StarDestroyerType));
		this.setDeck_Main(new MainDeck(this.StarDestroyerType));
		this.setDeck_Top(new TopDeck(this.StarDestroyerType));
		System.out.println("BRIDGE:\t\t\t\t"+this.getDeck_Bridge().getLength()+"\t"
				+this.getDeck_Bridge().getHeight()+"\t"+this.getDeck_Bridge().getWidth()+"\t"
				+this.getDeck_Bridge().getWeight());
		
		System.out.println("TOP DECK:\t\t\t"+this.getDeck_Top().getLength()+"\t"
				+this.getDeck_Top().getHeight()+"\t"+this.getDeck_Top().getWidth()+"\t"
				+this.getDeck_Top().getWeight());
		
		System.out.println("MAIN DECK:\t\t\t"+this.getDeck_Main().getLength()+"\t"
				+this.getDeck_Main().getHeight()+"\t"+this.getDeck_Main().getWidth()+"\t"
				+this.getDeck_Main().getWeight());
	}
	
	
	
	
	
	
	

}
