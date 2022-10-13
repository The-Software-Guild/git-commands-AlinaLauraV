/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assessment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class dogGenetics {
    public static void main(String[] args) {
    Random dice = new Random();
    Scanner userInput = new Scanner(System.in);
    String dogName;
    int percentage1 = 0, percentage2 = 0, percentage3 = 0, percentage4 = 0, percentage5 = 0;
    
    do{
        percentage1 = dice.nextInt(100) + 1;
        percentage2 = dice.nextInt(100 - percentage1) + 1;
        percentage3 = dice.nextInt(100 - percentage1 - percentage2) + 1;
        percentage4 = dice.nextInt(100 - percentage1 - percentage2 -percentage3) +1;
        percentage5 = dice.nextInt(100 - percentage1 -percentage2 - percentage3 - percentage4) + 1;
    } while (percentage1 == 0 && percentage2 == 0 && percentage3 == 0 && percentage4 == 0 && percentage5 == 0);
    System.out.print("What is your dog's name? ");
    dogName = userInput.nextLine();
    System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
    
        
    System.out.println(dogName + " is:");
    System.out.println("");
        
    System.out.println(percentage1 + "%" + " Chihuahua");
    System.out.println(percentage2 + "%" + " St.Bernand");
    System.out.println(percentage3 + "%" + " Dramatic RedNosed Asian Pug");
    System.out.println(percentage4 + "%" + " Common Cur");
    System.out.println(percentage5 + "%" + " King Doberman");   
    }
}
        
    
            
    

        

