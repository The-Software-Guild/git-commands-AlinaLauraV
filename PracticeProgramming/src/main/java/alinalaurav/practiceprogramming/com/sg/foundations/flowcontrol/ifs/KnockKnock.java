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
public class KnockKnock {
   public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

        if(nameGuess.equals("Marty McFly")){
            /*if we change method equals to == will throw an error as the method is not the same with ==*/
            /*to avoid capitalization problem can be used toLowerCase method*/
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    } 
}
