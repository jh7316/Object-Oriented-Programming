package chloe.DECK;

public abstract class ShipDeck {
	
	private String DeckType;
	private String StarDestroyerType;
	private int Length;
	private int Height;
	private int Width;
	private int Weight;
	
	
	
	public ShipDeck() {
		
	}

	public ShipDeck(String deckType, String starDestroyerType, int length, int height, int width, int weight) {
		super();
		DeckType = deckType;
		StarDestroyerType = starDestroyerType;
		Length = length;
		Height = height;
		Width = width;
		Weight = weight;
	}

	public String getDeckType() {
		return DeckType;
	}

	public void setDeckType(String deckType) {
		DeckType = deckType;
	}

	public String getStarDestroyerType() {
		return StarDestroyerType;
	}

	public void setStarDestroyerType(String starDestroyerType) {
		StarDestroyerType = starDestroyerType;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}
	
	@Override
	public String toString() {
		return "DeckSection DeckType: " + DeckType 
				+ "\n StarDestroyerType=" + StarDestroyerType 
				+ "\n Length=" + Length
				+ "\n Height=" + Height + ", Width=" + Width 
				+ "\n Weight=" + Weight;
	}
	
	public String DeckInfo() {
		return this.toString();
		
	}
	
	
	
	
	

}
