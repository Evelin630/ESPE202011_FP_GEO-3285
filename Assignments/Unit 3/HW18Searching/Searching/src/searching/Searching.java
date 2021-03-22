/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        
        int[] CarPrice = {25, 30, 40, 55, 80, 155, 210, 300, 420};
        int car;
        int search;
        int BinarySearch;

        Scanner input = new Scanner(System.in);
        
        System.out.println(" Welcome ");
        System.out.println(" ☼ Linear Search ☼ ");
        System.out.println(" ------------------- ");

        System.out.println(" Enter the Car Price ");
        car = input.nextInt();
        System.out.println("the car price " + car + " the price of the car is in the range: ---> " + search(CarPrice, car));

        System.out.println(" ☼ Binary Search ☼ ");
        System.out.println(" ------------------- ");

        System.out.println(" Enter the car price ");
        car = input.nextInt();
        System.out.println(" ------------------- ");
        System.out.println("the car price " + car + " the price of the car is in the range: ---> " + binarySearch(CarPrice, car));
    }

    private static int binarySearch(int[] CarPrice, int car) {
        int n = CarPrice.length;
        for (int i = 0; i < n; i++) {
            if (CarPrice[i] == car) {
                return i;
            }
        }
        return 1;
    }

    private static int search(int[] carPrice, int car) {
        return 1;
        
        

    }
    
    
}
    
    
    
    

