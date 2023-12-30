
public class EnhancedPlayer {
	private String fullName;
	private int healthPercentage;
	private String weapon;
	
	 public EnhancedPlayer(String fullName) {
		 this(fullName, 100, "Long Bow");
	 }

	public EnhancedPlayer(String fullName, int health, String weapon) {
		this.fullName = fullName;
		if(health <= 0) {
			this.healthPercentage = 1;
		}else if(health >100) {
			this.healthPercentage = 100;
		}else {
			this.healthPercentage = healthPercentage;
		}
		this.weapon = weapon;
	}
	
	 public void loseHealth(int damage) {

	      healthPercentage = healthPercentage - damage;
	      if (healthPercentage <= 0) {
	          System.out.println("You're dead....");
	      }
	 }
	 
	 public void restoreHealth(int extraHealth) {

	      healthPercentage = healthPercentage + extraHealth;
	      if (healthPercentage > 100) {
	          System.out.println("Player restored to 100%");
	          healthPercentage = 100;
	      }
	 }
	 
	 public int healthRemaining() {
		 return healthPercentage;
	 }
	
}
