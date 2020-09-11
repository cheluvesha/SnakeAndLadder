// Welcome to Snake And Ladder Game
import java.util.Random;
class SnakeAndLadder {

	final static int SNAKE = 2;
	final static int NO_PLAY = 0;
	final static int WIN_GOAL = 100;

	// welcome to starting of the Game	
	private static void welcomeToGame() {
		
		System.out.println("Player will Start from position 0");
	
	}
	
	// roll a die through random number generation
	private static int rollADie() { 
		
		Random random = new Random();
		int dieValue = random.nextInt(6) + 1;
		System.out.println("The rolled die value is: "+ dieValue);
		return dieValue;
	
	}
	
	// method to repeat till its reach 100
	private static void repeatTillPlayerReachGoal() {
		
		Random random = new Random();
		int win = 0;// position
		
		// to repeat till 100th position
		while( win < WIN_GOAL ) {
			
			int option = random.nextInt(3);
			int moveDie = rollADie();
			System.out.println(" option choice: "+option);			
	
			// On the basis of Option Player Position will take place
			if(option == NO_PLAY) {
				
				System.out.println("Player its a foult so no changes to the current position \n Current position is: "+win);
			
			}
			
			// condition win greater than roll die value to avoid negative value
			else if(option == SNAKE) {
				
				if(win > moveDie) {
					
					win -= moveDie;
				
				}
			
				else {
				
					win = 0;
				
				}

				System.out.println("oops!! Player you step on a snake so you will go back to "+moveDie+
				" step back Or Position will start from O Position");
			
			}
			
			else {

				win += moveDie;
				if( win > WIN_GOAL ) {
					
					win -= moveDie;
				
				}
				
				else {
					
					System.out.println("Congrats!! Player you advanced to: "+ moveDie +" positions");
					System.out.println(" Player currently you ended at: "+ win +" position");
				}
				
			}
			
			// condition to check whether its at 100
			if( win == WIN_GOAL ) {
				
				System.out.println("Congrats you have Reached 100th Position"); 
				
			}
			
		}
	} 

	public static void main(String args[]) {
		
		welcomeToGame();
	 	repeatTillPlayerReachGoal();
		
	}
}

