/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class StayPositive {
    public static void main(String[] args) {
//        int newCount = 10;
        System.out.println("What number should I count down for?");
        Scanner scanner = new Scanner(System.in);
        int newCount = Integer.parseInt(scanner.nextLine());
        if(newCount>=0){
        System.out.println("Counting down ... ");
        while (newCount >= 0) {
            System.out.print(" " + newCount);
            if(newCount % 10 == 0)
            System.out.print("\n");
            newCount --;
    }
        
        }else{
          System.out.println("Please choose a positive number! ");  
        }
}
}