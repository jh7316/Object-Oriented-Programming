package chloe.SUPPORT;

public class Position {

	private String name;
	private Location pos;
	
	public Position(String name,Location L) {
		this.name=name;
		this.pos=L;
		
	}
	/*
	public double distanceToPosition(Position P) {
		
	}
	*/
	public void displayPosition() {
		System.out.println("Currently Position : POSITION "+"["+this.name+"]");
		System.out.println("\tLocated At:\tXCoord:"+this.pos.getX()+"\tYCoord:"+this.pos.getY()+"\tZCoord:"+this.pos.getZ());
		
	}
}
