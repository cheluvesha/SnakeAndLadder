// Welcome to Snake And Ladder Game
import java.util.Random;
class SnakeAndLadder {

	final static int STEP = 3;
	
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
		int win = 0;

		// to repeat till 100th position

		while( win < 100 ) {
			
			int option = random.nextInt(3);
			int moveDie = rollADie();
				
			// On the basis of Option Player Position will take place
			if(option == 0) {

				System.out.println("Player its a foult so no changes to the current position \n Current position is: "+win);

			}

			// condition win greater than roll die value to avoid negative value
			else if(option == 2 && win > moveDie) {

				System.out.println("oops!! Player you step on a snake so you will go back to "+STEP+"  step back");
				win -= STEP;

			}

			else {
				win += moveDie;
				//to stop player exact in 100	
				if( win > 100 )

					win -= moveDie;
					
				else

					System.out.println("Congrats!! Player you advanced to: "+ moveDie +" positions");
					System.out.println(" Player currently you ended at: "+ win +" position");


			}

			// condition to check whether its at 100
			if( win == 100 )

				System.out.println("Congrats you have Reached 100th Position"); 

		}
	} 

	public static void main(String args[]) {

		welcomeToGame();
	 	checkNoplayLadderSnake();	

	}
}
