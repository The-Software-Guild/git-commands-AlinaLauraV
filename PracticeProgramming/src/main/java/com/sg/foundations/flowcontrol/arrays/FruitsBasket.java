/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author User
 */
public class FruitsBasket {
  public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};
        
        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;
        for(int i = 0; i < fruitBasket.length; i++){
            if("Apple" == fruitBasket[i]){
                numApples++;
            } else if("Orange" == fruitBasket[i]){
                numOranges++;
            }else{
                numOtherFruit++;
            }
        }
        System.out.println("Total number of apples: " + numApples);
        System.out.println("Total number of oranges: " + numOranges);
        System.out.println("Total number of other fruits: " + numOtherFruit);
        

        System.out.println("Total number of fruit: " + fruitBasket.length);
    }
}
 
