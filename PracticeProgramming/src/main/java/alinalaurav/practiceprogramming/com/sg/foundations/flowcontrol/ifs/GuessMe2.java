/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alinalaurav.practiceprogramming.com.sg.foundations.flowcontrol.ifs;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GuessMe2 {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    Random Random_number = new Random ();
    int numberToGuess = Random_number.nextInt(1000);
    int i=0;
    int guess;
    boolean win = false;
    while (win == false){
       System.out.println("Guess a number between 1 and 1000:");
       guess=input.nextInt();
       i++;
       if (guess== numberToGuess){
        win = true;
        }
       else if (guess < numberToGuess){
        System.out.println("Ha, nice try - too low! I chose" + numberToGuess);
        }
       else if (guess > numberToGuess){
        System.out.println("Too bad, way too high. I chose" + numberToGuess);
       }
    }
    
    
  System.out.println("Wow, nice guess! That was it!"); 
 
    }  
}
