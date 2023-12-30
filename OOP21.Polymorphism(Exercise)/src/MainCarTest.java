
public class MainCarTest {
	
	public static void main(String[] args) {

        Car car = new Car("Porshe Carrer");
        runRace(car);
        System.out.println();
        
        Car porshe = new GasPoweredCar("Porshe Carrera", 15, 6);
        runRace(porshe);
        System.out.println();
        
        Car bmw = new GasPoweredCar("IXM", 12, 6.5);
        runRace(bmw);
        System.out.println();
        
        Car toyota = new HybridCar("Rav4", 10, 7);
        runRace(toyota);
        System.out.println();
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
