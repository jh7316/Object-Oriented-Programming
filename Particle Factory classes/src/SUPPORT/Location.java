package SUPPORT;

public class Location {
	private String name;
	private int X;
	private int Y;
	
	public Location(String name,int x,int y) {
		this.name=name;
		this.X=x;
		this.Y=y;
	}
	
	public double euclideanDistance(Location L) {
		double dist=Math.sqrt((this.X-L.X)*(this.X-L.X)+(this.Y-L.Y)*(this.Y-L.Y));
		return dist;
		
	}
	
	public String toString() {
		return "<Location> Name: "+this.name+"\tx-position: "+this.X+"\ty-position: "+this.Y;
		
	}

}
