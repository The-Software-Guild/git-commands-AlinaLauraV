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
public class HighRoller {
    

    public static void main(String[] args) {
        
        System.out.println("What number of sides a single die has?");
        Scanner scanner = new Scanner(System.in);
        int sides = Integer.parseInt(scanner.nextLine());
        
        Random diceRoller = new Random();

        int rollResult = diceRoller.nextInt(sides) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!Ouch.");
        }
        if (rollResult == sides){
            System.out.println("You rolled a critical! Nice job!");
        }
            
        }
    }

    