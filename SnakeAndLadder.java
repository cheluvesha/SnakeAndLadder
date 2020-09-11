// Welcome to Snake And Ladder Game
import java.util.Random;
class SnakeAndLadder {

	static int player1Position;
	static int player2Position;
	static Random random = new Random();
	static int p1NoOfTimesDieRolled = 0;
	static int p2NoOfTimesDieRolled = 0;
	final static int STEP = 3;
	
	
	// welcome to starting of the Game	
	private static void welcomeToGame() {

		System.out.println("Player 1 and 2  will Start from position 0");
		System.out.println("<------------------------------------------------------->");

	}
	
	private static int rollADie() {

		Random random = new Random();
		int dieValue = random.nextInt(6) + 1;
		System.out.println("The rolled die value is: "+ dieValue);
		return dieValue;

	}
	
	private static int getOption() {
	
		int option = random.nextInt(3);
		return option;
		
	}
	
	private static void getToExactWinPosition() {

		int choice = 0;
		player1Position = 0;
		player2Position = 0;

		// to repeat till 100th position

		while( player1Posiiton < 100 && player2Position < 100 ) {
			
			int option = getOption();
			int moveDie = rollADie();

			// Alternate Play			
			if(choice % 2 == 0) {

				choice++;
				p1NoOfTimesDieRolled++;
			
			// On the basis of Option Player Position will take place
			if(option == 0) {

				System.out.println("Player 1 its a foult so no changes to the current position \n Current position is: "+player1Position);
				p1NoOfTimeDieRolled++;
			
			}

			// condition win greater than roll die value to avoid negative value
			else if(option == 2 && player1Position > moveDie) {

				System.out.println("oops!! Player you step on a snake so you will go back to "+STEP+"  step back");
				player1Position -= STEP;
				p1NoOfTimesDieRolled++;
				System.out.println("Current position is: "+player1Position);

			}

			else {
				player1Position += moveDie;
				
				//to stop player exact in 100	
				if( player1Position > 100 ) {

					player1Position -= moveDie;
					p1NoOfTimesDieRolled++;
					
				}

				else {

					System.out.println("Congrats!! Player you advanced to: "+ moveDie +" positions");
					System.out.println(" Player currently you ended at: "+  player1Position +" position");
					p1NoOfTimesDieRolled++;				
				}	
			}

			// condition to check whether its at 100
			if( player1Position == 100 ) {

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
