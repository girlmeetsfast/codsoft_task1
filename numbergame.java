
package NUMBERGAME;


//task1


import java.util.Random;//for using random function
import java.util.Scanner;

public class numbergame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

       
        int max = 100;
        int rounds = 0;
        int totalAtt;
        int min = 1;
        System.out.println("_________________________________________________");
       
        
        System.out.println("-----<3Welcome to the Number Guessing Game<3-----");
        
        System.out.println("_________________________________________________");
       
        System.out.print("type the maximum total attempts allowed for the game: ");
        totalAtt = scanner.nextInt();

     

        while (totalAtt > 0) {
            int maxAllowed;
            int gnum = random.nextInt(max - min + 1) + min;
            int player;
            int attempts = 0;

        
            System.out.print("<3<3<3<3type the number of attempts permitted for this round: ");
            maxAllowed = scanner.nextInt();

            System.out.println("Round " + (rounds + 1) + " - Guess the number between " + min + " and " + max);

            
            while (attempts < maxAllowed && totalAtt > 0) {
                System.out.print("Enter your guess: ");
                player = scanner.nextInt();
                attempts++;
                totalAtt--;
// if else conditions for each guess of the number
                if (player == gnum) {
                	System.out.println("_______________________________________________________________________________________");
                    System.out.println("Congratulations!wohooo <3 You guessed the correct number in " + attempts + " attempts.");
                    
                    System.out.println("_______________________________________________________________________________________");
                } else if (player < gnum) {
                	
                    System.out.println("smaller :( guess another one.");
                } else if(player > gnum) {
                	
                	
                    System.out.println("larger :( guess another one.");
                }

            }

            rounds++;

            System.out.println("Remaining attempts left for the entire game<3: " + totalAtt);

            if (totalAtt<= 0) {
            	
                System.out.println("You have  used all your attempts.you cant play the game any further.");
                
                break;
            }

            System.out.println("Do you wish to play again?tell tell (yes/no): ");
            
            System.out.println("write your answer :) ");
            
            String anothergame = scanner.next().toLowerCase();

            if (anothergame.equals("no")) {
                break;
            }
        }

        scanner.close();
    }
}










