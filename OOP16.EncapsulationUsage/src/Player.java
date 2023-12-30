
public class Player {

	public String fullName;
	public int health;
	public String weapon;
	
	public void loseHealth(int damage) {
		health = health - damage;
		if(health<=0) {
			System.out.println("You're dead.....");
		}
	}
	
	public int healthRemaining() {
		return health;
	}
	
	public void restoreHealth(int extraHealth) {
		health += extraHealth;
		if(health>100) {
			System.out.println("Health is restored 100%");
			health = 100;
		}
	}
}
