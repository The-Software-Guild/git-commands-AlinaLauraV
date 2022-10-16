/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TraditionalFizzBuzz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int fizz = 0, buzz = 0, fizzbuzz = 0;
        
        System.out.println("Let's play fizz buzz! How many rounds? ");
        int rounds = input.nextInt();
        
        for(int i = 0; i < 100; i++){
            
            if(((i%5) == 0) && ((i%3) == 0) && (i != 0)){
                System.out.println("fizz buzz");
                fizz++;
            } else if((i%5) == 0 && (i != 0)){
                System.out.println("buzz");
                buzz++;
            } else if((i%3) == 0 && (i != 0)){
                System.out.println("fizz");
                fizzbuzz++;
            } else {
                System.out.println(i);
            }
            
            if(rounds == (fizz+buzz+fizzbuzz)){
                System.out.println("TRADITION!!");
                break;
            }
        }
    }
}
