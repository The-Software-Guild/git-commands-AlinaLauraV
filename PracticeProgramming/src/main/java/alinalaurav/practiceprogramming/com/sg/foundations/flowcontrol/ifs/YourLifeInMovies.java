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
public class YourLifeInMovies {
    public static void main(String[] args) {
        
        
        Scanner inputReader = new Scanner(System.in);
                
        System.out.println("Hey, let's play a game! What's your name?");
        String name = inputReader.nextLine();
        
        System.out.println("Ok," + name + ", when were you born?");
        int dateBorn = inputReader.nextInt();
        
        if (dateBorn < 1965) {
            System.out.println("The MASH TV series has been around for almost half a century!");
        }

        if(dateBorn < 1975){
            System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today");
        }

        if(dateBorn < 1985){
            System.out.println("Space Jam came out not last decade, but the one before THAT!");
        }

        if(dateBorn < 1995){
            System.out.println("The first Harry Potter came out over 15 years ago!");
        }
         
        if(dateBorn < 2005){
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
        
        }
        
    }
}
