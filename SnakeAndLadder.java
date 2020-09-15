// Welcome to Snake And Ladder Game
import java.util.Random;
class SnakeAndLadder {
	// welcome to starting of the Game	
	private static void welcomeToGame() {
		System.out.println("Player will Start from position 0");
	}
	// roll a die through random number generation
	private static void rollADie() {	
		Random random = new Random();
		int dieValue = random.nextInt(6) + 1;
		System.out.println("The die value is: "+ dieValue);
	}
	public static void main(String args[]) {
	
		welcomeToGame();
	 	rollADie();	

	}
}
