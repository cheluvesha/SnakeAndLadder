// Welcome to Snake And Ladder Game
import java.util.Random;
class SnakeAndLadder {

	static final int STEP = 3;
	static final int SNAKE = 2;
	static final int NO_PLAY = 0;

	// welcome to starting of the Game	
	private static void welcomeToGame() {

		System.out.println("Player will Start from position 0");
		System.out.println("<------------------------------------------------------->");

	}
	
	// roll a die through random number generation
	private static int rollADie() {

		Random random = new Random();
		int dieValue = random.nextInt(6) + 1;
		System.out.println("The rolled die value is: "+ dieValue);
		return dieValue;

	}
	
	private static void getToExactWinPosition() {

		Random random = new Random();
		int win = 0;// Position
		int noOfTimeDieRolled = 0;
		
		// to repeat till 100th position
		while( win < 100 ) {
			
			int option = random.nextInt(3);
			int moveDie = rollADie();
				
			// On the basis of Option Player Position will take place
			if(option == NO_PLAY) {

				System.out.println("Player its a foult so no changes to the current position \n Current position is: "+win);
				noOfTimeDieRolled++;
			
			}

			// condition win greater than roll die value to avoid negative value
			else if(option == SNAKE && win > moveDie) {

				System.out.println("oops!! Player you step on a snake so you will go back to "+STEP+"  step back");
				win -= STEP;
				noOfTimeDieRolled++;
				System.out.println("Current position is: "+win);

			}

			else {
				win += moveDie;
				
				//to stop player exact in 100	
				if( win > 100 ) {

					win -= moveDie;
					noOfTimeDieRolled++;
					
				}

				else {

					System.out.println("Congrats!! Player you advanced to: "+ moveDie +" positions");
					System.out.println(" Player currently you ended at: "+ win +" position");
					noOfTimeDieRolled++;
				
				}	
			}

			// condition to check whether its at 100
			if( win == 100 ) {

				System.out.println("Congrats you have Reached 100th Position"); 
			
			}

		}

		System.out.println("<------------------------------------------------------->");		
		System.out.println("The Number of times Dice rolled is : "+noOfTimeDieRolled);

	} 

	public static void main(String args[]) {

		welcomeToGame();
	 	getToExactWinPosition();	

	}
}
