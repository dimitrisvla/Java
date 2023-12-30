
public abstract class Mammal extends Animal{

	public Mammal(String type, String size, double weight) {
		super(type, size, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(String speed) {
		
		System.out.print(getExplicitType() + " ");
		System.out.println(speed.equals("slow") ? "walks" : "runs");
		
	}

	@Override
	public void makeNoise() {}

	public abstract void shedHair();
}
