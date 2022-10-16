/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author User
 */
public class LazzyTeenager {
    public static void main(String[] args){
        Random num = new Random();
        int counter = 0;
        int randChance = num.nextInt((100-5) + 5) + 5;
        
        do{
            counter++;
            
            System.out.println("Clean your room! " + " (x" + counter + ")");
            
            if(counter == 7){
                System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
                break;
            } else if(randChance < 7){
                System.out.println("Fine! I'll clean my room...");
                break;
            }
        }while(true);
    }
}
