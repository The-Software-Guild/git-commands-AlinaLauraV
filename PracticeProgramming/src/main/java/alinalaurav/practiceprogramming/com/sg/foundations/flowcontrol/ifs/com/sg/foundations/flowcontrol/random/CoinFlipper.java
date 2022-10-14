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
public class CoinFlipper {
    public static void main(String[] args) {
        
        System.out.println("head or tail?");
                
        Scanner userInput = new Scanner(System.in);
        String userAns = userInput.nextLine();
        
        Random diceRoller = new Random();

        int rollResult = diceRoller.nextInt(2) + 1;

        System.out.println("Ready, Set, Flip....!!");
        
        if (rollResult ==1) {
            System.out.println("I know you wanted a " + userAns + " but you got head.");
        }
        if (rollResult ==2){
            System.out.println("I know you wanted a " + userAns + " but you got tail.");
        }
            
        }
}
