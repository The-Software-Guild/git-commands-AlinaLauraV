/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author User
 */
public class StillPositive {
  public static void main(String[] args){
        int[] numbers = { 389, -447, 26, -485, 712, -884, 94, -64, 868, -776, 227, -744, 422, -109, 259, -500, 278, -219, 799, -311};
        
        for(int i = 0; i < 20; i++){
            if(numbers[i] > 0){
                System.out.println("Gotta stay positive ...!");
                System.out.println(numbers[i]);
            }
        }
    }  
}
