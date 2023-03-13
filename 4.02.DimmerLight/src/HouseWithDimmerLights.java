
public class HouseWithDimmerLights {

	public static void main(String[] args) {
		
		DimmerLight bedroomLight = new DimmerLight();
		bedroomLight.flipSwitch();
		bedroomLight.dim();
		bedroomLight.printState();
	}

}
