/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author User
 */
public class WaitAWhile {
    public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 11;
// if bedTime is 11 nothing will happen as long as the timeNow<bedTime; the statement will only print the new time for bed
// if timeNow > bedTime will skip while because is false and will print only last statement;
// if timeNow++ is commented out will create an infinite loop because the condition is timeNow<bedTime and the time will never be bedTime
        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}
