import java.util.*;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Computer move code
        String computerMove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input==1)
            computerMove="ROCK";
        else if (input==2)
            computerMove="PAPER";
        else
            computerMove="SCISSORS";

        System.out.println("Lets play Rock Paper Scissors");

        //User input
        System.out.println("Enter your choice");
        String uinput= scan.next();
        String userMove=uinput.toUpperCase();
        System.out.println("Your input is "+userMove);

        //Game Logic
        if (userMove.equals(computerMove))
            System.out.println("Tie! Computer move was also "+computerMove);

        //if user move is rock
        else if(userMove.equals("ROCK"))
            if (computerMove.equals("PAPER"))
                System.out.println("Computer Wins! Computer move was "+computerMove);
            else
                System.out.println("User Wins! Computer move was "+computerMove);

        //if user move is paper
        else if (userMove.equals("PAPER"))
            if (computerMove.equals("SCISSORS"))
                System.out.println("Computer Wins! Computer move was "+computerMove);
            else
                System.out.println("User Wins! Computer move was "+computerMove);

        //if user move is scissor
        else if (userMove.equals("SCISSORS"))
            if (computerMove.equals("ROCK"))
                System.out.println("Computer Wins! Computer move was "+computerMove);
            else
                System.out.println("User Wins! Computer move was "+computerMove);
    }
}
