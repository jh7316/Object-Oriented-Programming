package chloe.ENGINE;

public class Engine_C extends ShipEngine{
	
	public Engine_C(String starDestroyerType) {
		super("C", starDestroyerType, 0,0,0,0);
		if(starDestroyerType.equals("Imperial_I")) {
			setLength(225);
			setHeight(75);
			setPower(15000000);
			setWeight(125);
		}else if(starDestroyerType.equals("Imperial_II")){
			setLength(275);
			setHeight(80);
			setPower(17000000);
			setWeight(125);
		}
	}
	
	

}
