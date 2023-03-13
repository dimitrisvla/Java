
public class HouseWithLights {

	public static void main(String[] args) {
		Light bedroomLight = new Light();
		bedroomLight.flipSwitch();
		bedroomLight.printState();
		bedroomLight.flipSwitch();
		bedroomLight.printState();
		
		Light kitchenLight = new Light();
		kitchenLight.flipSwitch();
		kitchenLight.printState();
	}

}
