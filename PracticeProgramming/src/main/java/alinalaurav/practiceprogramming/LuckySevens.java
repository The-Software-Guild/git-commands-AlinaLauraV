/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alinalaurav.practiceprogramming;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class LuckySevens {
   public static void main(String[] args){
        int moneyAvailable;
        int diceOne;
        int diceTwo;
        int sum = 0;
        int i;
        int numberOfRolls = 0;
        
        Scanner userInput = new Scanner(System.in);
        Random randomDice = new Random();
        
        System.out.println("How many dollars do you have? ");
        moneyAvailable = userInput.nextInt();
        
        for(i = 0; i < moneyAvailable; i++){
           
           diceOne = randomDice.nextInt(6) + 1;
           diceTwo = randomDice.nextInt(6) + 1;
           
           sum = diceOne + diceTwo;
           
           if(sum == 7){
               moneyAvailable = moneyAvailable + 4;
           } else {
               moneyAvailable = moneyAvailable - 1;
           }
           numberOfRolls++;
        }
        
        System.out.println("You're broke after " + numberOfRolls + " rolls.");
    }  
}
