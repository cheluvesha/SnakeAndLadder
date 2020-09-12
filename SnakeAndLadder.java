import java.util.Random;
class SnakeAndLadder {
		
	static Random random = new Random();
	static int player1Position = 0;
	static int player2Position = 0;
	static int p1noOfTimesDicePlayed=0;
	static int p2noOfTimesDicePlayed=0;
	final static int LADDER = 3;
        final static int SNAKE = 2;
        final static int NO_PLAY = 0;
        final static int WIN_GOAL = 100;

	// welcome to starting of the Game
	public static void welcomeToGame() {

		System.out.println("Player 1 Starts from 0");
		System.out.println("Player 2 Starts from 0");
		System.out.println("<----------------------------------------------------->");

	}

	//to get random number 1 to 6
	public static int rollADie() {

		int randomValue = random.nextInt(6)+1;
		return randomValue;
		
	}

	//to get option 0, 1, 2 or 3
	public static int getOption() {
		
		int option = random.nextInt(4);
		return option;
		
	}

	public static void playPlayer1Player2() {

		int choice = 0;
		player1Position = 0;
		player2Position = 0;
		while(player1Position < WIN_GOAL && player2Position < WIN_GOAL ) {

			int dieValue = rollADie();
			int option=getOption();
			
			//alternating playing
			if(choice%2==0) {
				choice++;
				p1noOfTimesDicePlayed++;
				
				// option 0 for NOPlay
				if(option == NO_PLAY) {
						
					System.out.println("player1 scored "+dieValue);
					System.out.println("player1 its a foult so he will stay in the same position");
					System.out.println("player1 is in position "+player1Position);
					System.out.println("<-------------------------------------------------------->");
					
				}
				
				// option 2 is for snake	//should not go to negative
				else if(option == SNAKE && player1Position > dieValue) {
					
						System.out.println("player1 scored "+dieValue);
						System.out.println("player1 step on a snake so he will go back by "+dieValue);
						player1Position = player1Position - dieValue;
						System.out.println("player1 is in position "+player1Position);
						System.out.println("<-------------------------------------------------->");

				}
				
				// option 3 is for Ladder
				else if(option == LADDER) {
					
					player1Position += dieValue;
					
					// to check whether die value made position reach out off 100
					if(player1Position > WIN_GOAL) {

						player1Position -= dieValue;
						System.out.println("player 1 you just need "+(WIN_GOAL - player1Position)+" to win so current die value is discarded");
						 		
					}
						 	
                         		System.out.println("Hey Player 1 as you got Ladder you will get an addition of one more chance to roll a die"+
                                                  "\n  Player 1 your Current Position is: " +player1Position);
                         		choice -= 1;
                 		
				}
				
				// option 1 is for continue game with no extra events
				else {

					player1Position = player1Position  +  dieValue;
					
					// to check whether die value made position reach out off 100
					if(player1Position > WIN_GOAL) {
						
						player1Position = player1Position - dieValue;
						System.out.println("player1 scored "+dieValue);
						System.out.println("player 1 has missed his turn he need "+(WIN_GOAL - player1Position)+" to win");
						System.out.println("<--------------------------------------------------------------------->");
						
					}
					
					else {

							System.out.println("player1 scored "+dieValue);
							System.out.println("player1 is incremented by "+dieValue);
							System.out.println("p1 are in position "+player1Position);
							System.out.println();

					}
					
					// to check whether player 1 reached the goal 
					if(player1Position == WIN_GOAL) {
						
						System.out.println("CONGRATS... player 1 has won the game");
						System.out.println("total no of time dice played by him is "+p1noOfTimesDicePlayed);
						System.out.println("<---------------------------------------------------------------->");

					}

			}

			else {
				
				choice++;
				p2noOfTimesDicePlayed++;
				
				// option 0 is for NoPlay	
				if(option == NO_PLAY) {

					System.out.println("player2 scored "+dieValue);
					System.out.println("player2 its a foult so he will stay in same position");
					System.out.println("player2 is in position "+player2Position);
					System.out.println("<------------------------------------------------------->");

				}

				// option 2 is for snake
				else if(option == SNAKE && player2Position > dieValue) {
					
					System.out.println("player2 scored "+dieValue);
					System.out.println("player2 step on snake he will go back by "+dieValue);
					player2Position = player2Position-dieValue;
					System.out.println("player2 is in position "+player2Position);
					System.out.println("<------------------------------------------------------->");
					
				}
				
				// option 3 is for Ladder
				else if(option == LADDER) {
					 	
					player2Position += dieValue;

					// to check whether die value made position reach out off 100
					if(player2Position > WIN_GOAL) {
					 	
						player2Position -= dieValue;
						System.out.println("player 2 you just need "+(WIN_GOAL-player2Position)+" to win so current die value is discarded");					 		
					 	
					}
					 	
                     			System.out.println("Hey Player 2 as you got Ladder you will get an addition of one more chance to roll a die"+
                                              "\n  Player your Current Position is: " +player2Position);
                     			choice -= 1;
             
				}
				
				// option 1 is for continue game	
				else {   
				
					player2Position = player2Position + dieValue;
	
					// to check whether die value made position reach out off 100
					if(player2Position > WIN_GOAL) {
							
							player2Position = player2Position - dieValue;
							System.out.println("player2 scored "+dieValue);
							System.out.println("player 2 has missed his turn he need "+(WIN_GOAL-player2Position)+" to win");
							System.out.println("<-------------------------------------------------------------------------->");
						
					}
					
					else {
						
						System.out.println("player2 scored "+dieValue);
						System.out.println("player2 are incremented by "+dieValue);
						System.out.println("player2 is in position "+player2Position);
						System.out.println("<------------------------------------------------------------------>");
						
					}
					
				if(player2Position == WIN_GOAL) {

						System.out.println("CONGRATS... player 2 has won the game");
						System.out.println("total no of time dice played by him is "+p2noOfTimesDicePlayed);
					
				}
			}


			}


		}

	public static void main(String[] args) {
	
			welcomeToGame();
			playPlayer1Player2();	
		
	}
}
