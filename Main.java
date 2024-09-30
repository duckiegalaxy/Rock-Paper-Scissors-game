import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int UserWins=0;
        int AIWins=0;
        int tie =0;
        System.out.println("Select Difficulty Level: 1. Easy  2. Medium");
        boolean GameOnGoing = true;
        while (GameOnGoing) {
            System.out.println("choose rock , paper , scissors and -1 to exit");
            String choice = input.next();
            if (choice.equals("-1")){
                System.out.println("Total number of User wins: " + UserWins + "!");
                System.out.println("Total number of AI wins: " + AIWins + "!");
                System.out.println("Total number of Ties: " + tie + "!");
                GameOnGoing=false;
            }
            if (!(choice.equalsIgnoreCase("scissors") || choice.equalsIgnoreCase("rock") || choice.equalsIgnoreCase("paper") || choice.equalsIgnoreCase("-1"))) {
                System.out.println("you can only choose between rock , paper and scissors ");
                continue;
            }
            if (!choice.equals("-1")) {
                String[] AIchoice = {"Rock", "paper", "scissors"};
                int RandomIndex = random.nextInt(AIchoice.length);
                String FAiChoice = AIchoice[RandomIndex];
                System.out.println("AI chose " + FAiChoice);
                if (FAiChoice.equalsIgnoreCase(choice)) {
                    System.out.println("It's a Tie!");
                    tie++;
                } else if (FAiChoice.equalsIgnoreCase("rock") && choice.equalsIgnoreCase("Paper")) {
                    UserWins++;
                    System.out.println("USER WON!");
                } else if (FAiChoice.equalsIgnoreCase("paper") && choice.equalsIgnoreCase("rock")) {
                    AIWins++;
                    System.out.println("AI WON");
                } else if (FAiChoice.equalsIgnoreCase("scissors") && choice.equalsIgnoreCase("paper")) {
                    AIWins++;
                    System.out.println("AI WON");
                } else if (FAiChoice.equalsIgnoreCase("paper") && choice.equalsIgnoreCase("scissors")) {
                    UserWins++;
                    System.out.println("USER WON");
                } else if (FAiChoice.equalsIgnoreCase("scissors") && choice.equalsIgnoreCase("rock")) {
                    UserWins++;
                    System.out.println("USER WON");
                } else if (FAiChoice.equalsIgnoreCase("rock") && choice.equalsIgnoreCase("scissors")) {
                    AIWins++;
                    System.out.println("AI WON");
                }
            }
        }

    }
}