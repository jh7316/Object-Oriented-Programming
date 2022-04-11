package chloe.DECK;

public class MainDeck extends ShipDeck{
	
	public MainDeck(String starDestroyerType) {
		super("Main Deck", starDestroyerType, 0,0,0,0);
		
		if(starDestroyerType.equals("Imperial_I")) {
			setLength(600);
			setHeight(50);
			setWidth(400);
			setWeight(250);
		}else if(starDestroyerType.equals("Imperial_II")){
			setLength(700);
			setHeight(56);
			setWidth(450);
			setWeight(300);
		}
	}

}
