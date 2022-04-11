package chloe.DECK;

public class Bridge extends ShipDeck{



	public Bridge(String starDestroyerType) {
		super("Bridge", starDestroyerType, 0,0,0,0);
		if(starDestroyerType.equals("Imperial_I")) {
			setLength(150);
			setHeight(20);
			setWidth(100);
			setWeight(75);
		}else if(starDestroyerType.equals("Imperial_II")){
			setLength(200);
			setHeight(22);
			setWidth(150);
			setWeight(100);
		}
	}
	
	
	

}
