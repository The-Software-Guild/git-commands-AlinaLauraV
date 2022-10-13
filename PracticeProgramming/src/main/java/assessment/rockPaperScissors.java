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
public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rounds of Rock-Paper-Scissors would you like to play?");
        int rounds = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < rounds; i++) { 
            if (rounds < 0){
            System.out.println("Error!");
            }
            else if (rounds > 10){
            System.out.println("Error!");
            }
            else {
                playRockPaperSc(scanner);
                }
            }
    }
    
    static void playRockPaperSc(Scanner scanner) {
        // user input
        System.out.println("Choose please! (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

        // computer input
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        
        int tie = 0;
        int userWin = 0;
        int computerWin = 0;
        
        String computerMove;
        if (randomNumber == 1) {
            computerMove = "rock";
        } else if (randomNumber == 2) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose " + computerMove + "!");

        // results
        if (playerMove.equals(computerMove)) {
            tie ++;
            System.out.println("It's a tie!");
            System.out.println("Final results: " + "ties: " + tie + " user wins: " + userWin + " computer wins: " + computerWin);
        } else if (playerWins(playerMove, computerMove)) {
            userWin ++;
            System.out.println("You won!");
            System.out.println("Final results: " + "ties: " + tie + " user wins: " + userWin + " computer wins: " + computerWin);
        } else {
            computerWin ++;
            System.out.println("Computer won!");
            System.out.println("Final results: " + "ties: " + tie + " user wins: " + userWin + " computer wins: " + computerWin);
        }
    }

    static boolean playerWins(String playerMove, String computerMove) {
        if (playerMove.equals("rock")) {
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");
        }
    }
}
