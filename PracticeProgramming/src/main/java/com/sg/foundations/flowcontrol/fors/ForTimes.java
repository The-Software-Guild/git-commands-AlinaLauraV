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
public class ForTimes {
   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("What times table should be recited? ");
        int userNum = input.nextInt();
        
        for(int i = 1; i <= 15; i++){
            System.out.println(i + " * " + userNum + " is: " + (i*userNum));
        }
    } 
}
