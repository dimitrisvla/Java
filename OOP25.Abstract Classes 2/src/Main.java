import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		// Animal animal = new Animal("Animal", "big", 50);
		
		Dog dog = new Dog("Wolf", "big", 100);
		dog.makeNoise();
		doAnimalStuff(dog);
		
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(dog);
		animals.add(new Dog("German Shepard", "big", 40));
		animals.add(new Fish("Goldfish", "small", 1));
		animals.add(new Dog("Pug", "small", 10));
		animals.add(new Dog("Dogo", "big", 30));
		
		for(Animal animal: animals) {
			doAnimalStuff(animal);
		}

	}
	
	private static void doAnimalStuff(Animal animal) {
		
		animal.makeNoise();
		animal.move("slow");
	}

}
