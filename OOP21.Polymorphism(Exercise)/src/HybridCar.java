
public class HybridCar extends Car{
	
	private double avgKmPerLiter;
	private int batterySize;
	private int cylinders = 6;
	
	public HybridCar(String descrption) {
		super(descrption);
	}

	public HybridCar(String descrption, double avgKmPerLitre, int baterrySize) {
		super(descrption);
		this.avgKmPerLiter = avgKmPerLitre;
		this.batterySize = baterrySize;
	}
	
	@Override
    public void startEngine() {
        System.out.printf("Hybrid Car:  %d cylinders are working.%n", cylinders);
        System.out.printf("Hybrid Car:  switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid Car: usage average: %.2f %n", avgKmPerLiter);
    }

}
