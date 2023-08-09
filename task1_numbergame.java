import java.util.*;
public class task1_numbergame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int minimumRange = 1;
        int maximumRange = 100;
        int maxAttempts = 5; 
        int score = 0;
        System.out.println("!Welcome to Random Number generate guessing game!!");
        System.out.println("The range of generating number is 1 to 100");
        System.out.println("!!!You have 5 chances to guess the number!!!");
        boolean playAgainInput = true;
        while (playAgainInput)
        {
            int randomNumber=(int)(Math.random()*(maximumRange-minimumRange))+minimumRange;
            int count = 0;
            boolean correctlyGuessNumber = false;
            while(count<maxAttempts)
            {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                count++;
                
                if(userGuess == randomNumber)
                {
                    System.out.println("congratulations! You guessed the correct number.");
                    correctlyGuessNumber = true;
                    break;
                }
                else if (userGuess<randomNumber)
                {
                    System.out.println("Too low!Try Again.");
                }
                else
                {
                 System.out.println("Too high! Try Again.");
                }
            }    
            if (!correctlyGuessNumber)
            {
                System.out.println("You have used all your attempts. The correct number was: " + random);
            }
            score += correctlyGuessNumber ? 1 : 0;
            System.out.println("Do you want to play again KUDOS!!!!!?(((yes/no))): ");
            String playAgainfile = sc.next().toLowerCase();
            playAgainInput = playAgainfile.equals("yes") || playAgainfile.equals("y");
        }
        System.out.println("GAME OVER THANK YOU FOR PLAYING THIS GAME . YOUR GAME-SCORE IS: " + score);
    }
}