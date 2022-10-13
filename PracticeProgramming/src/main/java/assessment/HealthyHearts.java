/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assessment;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int age;
        int maxHeart, bottomZoneTarget, topZoneTarget;

        System.out.print("What is your age?  ");
        age = parseInt(inputReader.nextLine());

        maxHeart = 220 - age;
        //used Math.round to return int as shown in assignment
        bottomZoneTarget = (int) Math.round(maxHeart * .5);
        topZoneTarget = (int) Math.round(maxHeart * .85);

        System.out.println("Your maximum heart rate should be " + maxHeart + " beats per minute.");
        System.out.println("Your target HR Zone is " + bottomZoneTarget + " - " + topZoneTarget + " beats per minute.");
    }
    
}
