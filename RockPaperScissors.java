import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock,Paper,Scissors!");

        int win =0;
        int losses =0;

        while(true)
        {
           
            System.out.println("What is your move? To make a move,enter rock, paper, or scissors. To quit the game, enter quit. ");
            String myMove = sc.nextLine();
           

            
            // Checks if the user chose quit option or not
            if(myMove.equals("Quit")){
                break;
            }

            //  Checks if the user has made valid input or not
            if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors"))
            {
                System.out.println("Invalid input. Please check again");
            }
            else{
               
                // Getting randome number btw 0 -3 and converting into integer
                int randomNumber = (int)(Math.random()*3);

                // converting random number to a string 
                String opponentMove = "";
				if(randomNumber == 0) {
					opponentMove = "rock";
				} else if(randomNumber == 1) {
					opponentMove = "paper";
				} else {
					opponentMove = "scissors";
				}
				System.out.println("Opponent move: " + opponentMove);
					
				//Print the results of the game: tie, lose, win
				if(myMove.equals(opponentMove)) {
					System.out.println("It's a tie!"+'\n');
				} else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
					System.out.println("You won!"+'\n');
					//EXTENSION: Increment wins
					win++;
				} else {
					System.out.println("You lost!");
					//EXTENSION: Increment losses
					losses++;
				}


                  System.out.println("You have won " + win + " games and have lost " + losses + " games.");
            
                }
    }

        if(win>losses)
        {
            System.out.println("You won more games than you lost");
        }
        else if(win<losses)
        {
            System.out.println("You lost more games than you wins");
        }
        else{
            System.out.println("Thanks for playing Rock, Paper, Scissors!");
        }
        
    }
}
