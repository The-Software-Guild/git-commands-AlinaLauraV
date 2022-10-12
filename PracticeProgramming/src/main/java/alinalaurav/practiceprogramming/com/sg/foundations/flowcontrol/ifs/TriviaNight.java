/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alinalaurav.practiceprogramming.com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TriviaNight {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        int numCorrect = 0;
        System.out.println("Welcome to Trivia");
        System.out.println("What is the Lowest Level Programming Language?");
        System.out.println("1) Source Code");
        System.out.println("2) Assembly Language");
        System.out.println("3) C#");
        System.out.println("4) Machine Code");
        String response = reader.nextLine();
        
        if (response.equals("3")){
             System.out.println("Correct!");
             numCorrect +=1;
         }else{
             System.out.println("Nope!");
         }
    
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("1) Grace Hopper");
        System.out.println("2) Alan Turing");
        System.out.println("3) Charles Babbage");
        System.out.println("4) Larry Page");
        response = reader.nextLine();
        
        if (response.equals("3")){
             System.out.println("Correct!");
             numCorrect +=1;
         }else{
             System.out.println("Nope!");
         }
    int totalQuestions = 2;
    double score = numCorrect;
    System.out.println("Your score is" + " " + score + " " + "from" + " " + totalQuestions);
    
    }
}
