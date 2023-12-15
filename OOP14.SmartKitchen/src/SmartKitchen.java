
public class SmartKitchen {

	private CoffeeMaker brewMaker;
	private DishWasher dishWasher;
	private Refrigerator refrigerator;
	
	public SmartKitchen() {
		brewMaker = new CoffeeMaker();
		dishWasher = new DishWasher();
		refrigerator = new Refrigerator();
	}

	public CoffeeMaker getBrewMaker() {
		return brewMaker;
	}

	public DishWasher getDishWasher() {
		return dishWasher;
	}

	public Refrigerator getRefrigerator() {
		return refrigerator;
	}
	
	public void kitchenFunctions() {
		brewMaker.brewCoffee();
		dishWasher.doDishes();
		refrigerator.orderFood();
	}
	
	public void setKitchen(boolean coffeeMakerFlag, boolean dishWasherFlag, 
			boolean refrigeratorFlag) {
		brewMaker.setHasWorkToDo(coffeeMakerFlag);
		dishWasher.setHasWorkToDo(dishWasherFlag);
		refrigerator.setHasWorkToDo(refrigeratorFlag);
	}
}
