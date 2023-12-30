
public class ElectricCar extends Car {
	
	private double avgKmPerCharge;
	private double batterySize;
	
	public ElectricCar(String descrption) {
		super(descrption);
	}

	public ElectricCar(String descrption, double avgKmPerCharge, double baterrySize) {
		super(descrption);
		this.avgKmPerCharge = avgKmPerCharge;
		this.batterySize = baterrySize;
	}

	 @Override
	  public void startEngine() {
	      System.out.printf("Electric Car: battery %d kWh on %n ", batterySize);
	  }

	  @Override
	  protected void runEngine() {
	      System.out.printf("Electric Car: usage under the average: %.2f %n ", avgKmPerCharge);
	  }
}
