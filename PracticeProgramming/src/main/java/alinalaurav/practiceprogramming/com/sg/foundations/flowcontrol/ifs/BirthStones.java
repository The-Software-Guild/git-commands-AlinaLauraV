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
public class BirthStones {
    public static void main(String[] args) {
    int BirthStone;
    Scanner in = new Scanner(System.in); 
    System.out.println("What is your birth month? ex. 1 = jan, 2 = feb");
    BirthStone = in.nextInt();
    if (BirthStone == 1)  {
        System.out.println("Your birthstone is garnet!");
    } else if (BirthStone == 2)  {
        System.out.println("Your birthstone is amethyst!");
    } else if (BirthStone == 3)  {
        System.out.println("Your birthstone is aquamarine!");
    } else if (BirthStone == 4)  {
        System.out.println("Your birthstone is diamond!");
    } else if (BirthStone == 5)  {
        System.out.println("Your birthstone is emerald!");
    } else if (BirthStone == 6)  {
        System.out.println("Your birthstone is pearl!");
    } else if (BirthStone == 7)  {
        System.out.println("Your birthstone is ruby!");
    } else if (BirthStone == 8)  {
        System.out.println("Your birthstone is peridot!");
    } else if (BirthStone == 9)  {
        System.out.println("Your birthstone is saphire!");
    } else if (BirthStone == 10)  {
        System.out.println("Your birthstone is opal!");
    } else if (BirthStone == 11)  {
        System.out.println("Your birthstone is topaz!");
    } else if (BirthStone == 12)  {
        System.out.println("Your birthstone is turquoise!");
    } else if (BirthStone < 1)  {
        System.out.println("I think you must be confused," + BirthStone + " " + "doesn't match a month!");
    } else if (BirthStone > 12)  {
        System.out.println("That's not a month you silly goose!!");
    }
    }
  
}
