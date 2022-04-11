package chloe.ENUMS;

public enum Stormtrooper {
	Standard("Standard",76,215,25),
	Scout("Scout",72,185,28),
	Assault("Assault",74,230,26);
	
	private String type;
	private int height;
	private int weight;
	private int age;
	
	Stormtrooper(String type,int height, int weight,int age){
		this.type=type;
		this.height=height;
		this.weight=weight;
		this.age=age;
	}

}
