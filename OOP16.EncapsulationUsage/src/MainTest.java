
public class MainTest {

	public static void main(String[] args) {
//      Player player = new Player();
//      player.name = "Dim";
//      player.health = 33;
//      player.weapon = "Long Sword";
//
//      int damage = 20;
//      player.loseHealth(damage);
//      System.out.println("Remaining health = " + player.healthRemaining());
//      player.health = 200;
//      player.loseHealth(250);
//      System.out.println("Remaining health = " + player.healthRemaining());

		
		EnhancedPlayer jim = new EnhancedPlayer("Jim", 500,"Dragon Sword");
        System.out.println("Initial health is :" + jim.healthRemaining());
	}

}
