/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alinalaurav.practiceprogramming.com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author User
 */
public class SpaceRustlers {
    public static void main(String[] args) {

        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        if(aliens > cows){
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        } else{
            System.out.println("Oh no! The herds got restless and took over! Looks like _we're_ hamburger now!!");
        }
        
    }
    /*the if statement will specify a block of Java code to be executed (System.out.println("Vrroom, vroom! Let's get going!");) if a condition is true(aliens > spaceships)*/
    /*else will specify a block of code to be executed if the condition is false*/
   /*If you remove the else from the else if nothing willhapen in this case as the if condition is true*/
}
