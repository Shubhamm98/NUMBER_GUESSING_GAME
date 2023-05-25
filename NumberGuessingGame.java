import java.util.Scanner;
 
public class NumberGuessingGame
    {                        
    public static void guessingNumberGame()
    {
        
        Scanner sc = new Scanner(System.in);
 
        
        int number = 1 + (int)(50
                               * Math.random());
 
        
        int S = 7;
 
        int i, guess;
 
        System.out.println(
            "A number is chosen"
            + " between 1 to 50."
            + "Guess the number"
            + " within 5 trials.");
 
        
        for (i = 0; i < S; i++) {
 
            System.out.println(
                "Guess the number:");
 
            
            guess = sc.nextInt();
 
            
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break;
            }
            else if (number > guess
                     && i != S - 1) {
                System.out.println(
                    "The number is "
                    + "greater than " + guess);
            }
            else if (number < guess
                     && i != S - 1) {
                System.out.println(
                    "The number is"
                    + " less than " + guess);
            }
        }
 
        if (i == S) {
            System.out.println(
                "You have exhausted"
                + " S trials.");
 
            System.out.println(
                "The number was " + number);
        }
    }
 
    
    public static void main(String arg[])
    {
 
        
        guessingNumberGame();
    }
}