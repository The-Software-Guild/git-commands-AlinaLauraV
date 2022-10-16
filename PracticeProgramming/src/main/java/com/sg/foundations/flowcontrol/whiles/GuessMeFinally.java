/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class GuessMeFinally {
   public static void main(String[] args){
        Random randomNum = new Random();
        Scanner userInput = new Scanner(System.in);
        int aiNum = randomNum.nextInt(100 - (-100) + 1) + (-100);
        
        System.out.println("Guess a number between -100 and 100: ");
        int userNum = userInput.nextInt();
        
        System.out.println("Your guess: " + userNum);
        
        while(userNum != aiNum){
            if(userNum > aiNum){
                System.out.println("Whoa, too high! Try again!");
                userNum = userInput.nextInt();
                System.out.println("Your guess: " + userNum);
            } else if(userNum < aiNum){
                System.out.println("Bummer, too low. Try again!");
                userNum = userInput.nextInt();
                System.out.println("Your guess: " + userNum);
            } else {
                System.out.println("Too bad, so sad. Try again!");
                userNum = userInput.nextInt();
                System.out.println("Your guess: " + userNum);
            }
        }
        if(userNum == aiNum){
            System.out.println("Finally! It's about time you got it!");
        } 
    } 
}
