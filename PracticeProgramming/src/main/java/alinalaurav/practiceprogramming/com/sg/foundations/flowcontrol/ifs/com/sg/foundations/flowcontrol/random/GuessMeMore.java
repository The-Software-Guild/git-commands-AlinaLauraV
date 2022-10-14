/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alinalaurav.practiceprogramming.com.sg.foundations.flowcontrol.ifs.com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GuessMeMore {
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    Random Random_number = new Random ();
    int numberToGuess = Random_number.nextInt(-100,100)+1;
    int i=0;
    int guess;
    boolean win = false;
    while (win == false){
       System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
       guess=input.nextInt();
       i++;
       if (guess== numberToGuess){
        win = true;
        System.out.println("Wow, nice guess! That was it!");
        }
       else if (guess < numberToGuess){
        System.out.println("Ha, nice try - too low!. Try again!");
        }
       else if (guess > numberToGuess){
        System.out.println("Too bad, way too high. I chose" + " " + numberToGuess);
        break;
       }
    }
    
    
  
 
    }  
}
