/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alinalaurav.practiceprogramming;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Factorizer {
    public static void main(String[] args){
        int userNum;
        int factor = 0;
        int sum = 0;
    
        Scanner userInput = new Scanner(System.in);
    
        System.out.println("What number would you like to factor? ");
        userNum = userInput.nextInt();
        System.out.println("The factors of " + userNum + " are: ");
        for(int i = 1; i < userNum; i++){
            if((userNum%i) == 0){
                System.out.println(i);
                factor++;
                sum = i + i;
            }
        }
        if(sum == userNum){
            System.out.println(userNum + " is a perfect number.");
        } else {
            System.out.println(userNum + " is not a perfect number.");
        }
        if(factor == 1){
            System.out.println(userNum + " is a prime number.");
        } else {
            System.out.println(userNum + " is not a prime number.");
        }
    }
}
