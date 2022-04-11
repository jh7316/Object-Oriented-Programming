package chloe.DECK;

public class TopDeck extends ShipDeck {
	
	public TopDeck(String starDestroyerType) {
		super("Top Deck", starDestroyerType, 0, 0, 0, 0);
		
		if(starDestroyerType.equals("Imperial_I")) {
			setLength(300);
			setHeight(30);
			setWidth(250);
			setWeight(125);
		}else if(starDestroyerType.equals("Imperial_II")){
			setLength(350);
			setHeight(34);
			setWidth(300);
			setWeight(150);
		}
	}

}
