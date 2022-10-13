/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assessment;

/**
 *
 * @author User
 */
public class SummativeSums {
    public static void main(String[] args) {
        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = {999, -60, -77, 14, 160, 301};
        int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("Array Sum: " + sumArrays(array1));
        System.out.println("Array Sum: " + sumArrays(array2));
        System.out.println("Array Sum: " + sumArrays(array3));

    }

    public static int sumArrays(int[] arrayToAdd) {
        int sum = 0;
        for (int i = 0; i < arrayToAdd.length; i++) {
            sum += arrayToAdd[i];
        }
        return sum;
    }
}
