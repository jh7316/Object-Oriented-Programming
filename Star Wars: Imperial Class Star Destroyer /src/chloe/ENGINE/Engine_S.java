package chloe.ENGINE;

public class Engine_S extends ShipEngine{
	
	public Engine_S(String starDestroyerType) {
		super("S", starDestroyerType, 0,0,0,0);
		if(starDestroyerType.equals("Imperial_I")) {
			setLength(100);
			setHeight(50);
			setPower(8000000);
			setWeight(100);
		}else if(starDestroyerType.equals("Imperial_II")){
			setLength(115);
			setHeight(60);
			setPower(9000000);
			setWeight(100);
		}
	}

}
