/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alinalaurav.practiceprogramming.com.sg.foundations.flowcontrol.ifs.com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author User
 */ 
public class ALittleChaos {
    public static void main(String[] args) {

        Random randomizer = new Random();
        int num = randomizer.nextInt(101);
        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        
        
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));
    }
            
     //int num = randomizer.nextInt(51)+50; will generate an int from 0 to 50 and will add 50  
    //Java provides the Math class in the java.util package to generate random numbers or you can use the java.util.Random class to generate random numbers of different types, such as int, float, double, long, and boolean
    }
            
            
            

