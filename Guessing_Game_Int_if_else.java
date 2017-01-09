/*
guessing game, randomize  a number and make the user guess by displaying wither too high or too low
 */
package guessing_game_int_if_else;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Novjean
 */
public class Guessing_Game_Int_if_else {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        Random rand = new Random();
        int randNum = rand.nextInt(50)+1;
        System.out.println("Number to guess: " + randNum);
        
        int guessNum = 0;
        while(guessNum != randNum){
            System.out.println("Make a guess: ");
            guessNum = in.nextInt();
            if(guessNum<randNum)
                System.out.println("Too low.");
            else if(guessNum>randNum)
                System.out.println("Too high");
            else
                System.out.println("Bingo, you guessed it!!!");
        }
        
    }
    
}
