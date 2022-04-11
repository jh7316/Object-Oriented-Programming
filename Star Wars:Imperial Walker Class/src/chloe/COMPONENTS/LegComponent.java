package chloe.COMPONENTS;

import chloe.ENUMS.Side;

public abstract class LegComponent {
	
	private String type;
	private Side legSide;
	
	public LegComponent(String type, Side legSide) {
		this.type=type;
		this.legSide=legSide;
	}

}
