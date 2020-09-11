// Welcome to Snake And Ladder Game
import java.util.Random;
class SnakeAndLadder {

	// welcome to starting of the Game	
	private static void welcomeToGame() {
		
		System.out.println("Player will Start from position 0");
	
	}
	
	private static int rollADie() {
		
		Random random = new Random();
		int dieValue = random.nextInt(6) + 1;
		System.out.println("The rolled die value is: "+ dieValue);
		return dieValue;
		
	}
	
	private static void checkNoplayLadderSnake() {
		
		Random random = new Random();
		int option = random.nextInt(3);
		int moveDie = rollADie();
			
		// On the basis of Option Player Position will take place
		if(option == 0) {
			
			System.out.println("Player its a foult so no changes to the current position");
		
		}
		
		else if(option == 2) {
			
			System.out.println("oops!! Player you step on a snake so you will go back to 3 step back");
		
		}
		
		else {
			
			System.out.println("Congrats!! Player you advanced to: "+ moveDie +" positions");
		
		}
	} 

	public static void main(String args[]) {
		
		welcomeToGame();
	 	checkNoplayLadderSnake();
		
	}
}
