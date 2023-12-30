
public class GasPoweredCar extends Car{

	private double avgKMPerLitre;
	private double cylinders = 6;
	
	public GasPoweredCar(String descrption) {
		super(descrption);
	}

	public GasPoweredCar(String descrption, double avgKMPerLitre, double cylinders) {
		super(descrption);
		this.avgKMPerLitre = avgKMPerLitre;
		this.cylinders = cylinders;
	}

	public void startEngine() {
		System.out.printf("GasPoweredCar: All cylinders are working\n"
				+ "Ready to start \n" + cylinders);
	}
	
	@Override
    protected void runEngine() {
        System.out.printf("GasPoweredCar: usage per average: %.2f %n ", avgKMPerLitre);
	}
	
}
