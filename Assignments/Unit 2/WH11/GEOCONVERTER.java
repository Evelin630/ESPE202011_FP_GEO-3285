/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoconverter;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class GEOCONVERTER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner lector = new Scanner(System.in);
         boolean mainLoop = true;
         int option;

        do {
            double kilometers;
            double meters;
            double centimeters;
            double millimeters;
            double nanometers;
            double inches;
            double micrometers;
            double feet;
            double gigameters;
            double yard;
            
            System.out.println("***WELCOME TO GEOCONVERTER***");
            System.out.println("¿How I can help?");
            System.out.println("--->1 The  Kilometers to meters.");
            System.out.println("--->2 The Meters to centimeters.");
            System.out.println("--->3 The Meters to millimeters");
            System.out.println("--->4 The Meters to nanometers.");
            System.out.println("--->5 The Meters to feet.");
            System.out.println("--->6 The Meters to inches.");
            System.out.println("--->7 The Centimeters to micrometers.");
            System.out.println("--->8 The Centimeters to inches.");
            System.out.println("--->9 The Millimeters to nanometers.");
            System.out.println("--->10 The Kilometers to centimeters.");

            System.out.println(" *==Enter  menu option*== ");
             Scanner input = null ;   
             option = input.nextInt();

             switch (option) {

                case 1:
                    runforKilometerstSetometers(input);
                    break;
                case 2:
                    runforMeterstocentimeters(input);
                    break;
                case 3:
                    runforMeterstomillimeters(input);
                    break;
                case 4:
                    runforMeterstonanometers(input);
                    break;

                case 5:
                    runforMeterstofeet(input);
                    break;

                case 6:
                    runforMeterstoinches(input);
                    break;

                case 7:
                    runforCentimeterstomicrometers(input);
                    break;
                case 8:
                    runforCentimeterstoinches(input);
                    break;

                case 9:
                    runforMilllimeterstonanometers(input);
                    break;

                case 10:
                    runforKilometerstocentimeters(input);
                    break;

                case 14:
                    System.out.println("*====GOOD BYE USER ====*");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }
        } while (option != 14);

    }

    private static void runforKilometerstocentimeters(Scanner input) {
        int kilometers;
        int centimeters;
        System.out.println("**Enter the number** ");
        kilometers = input.nextInt();
        centimeters = kilometers * 100000;
        System.out.println(kilometers + " kilometers is equal to " + centimeters + " centimeters\n ");
    }

    private static void runforMilllimeterstonanometers(Scanner input) {
        int millimeters;
        int nanometers;
        System.out.println("**Enter the number** ");
        millimeters = input.nextInt();
        nanometers = millimeters * 1000000;
        System.out.println(millimeters + " millimeters is equal to " + nanometers + " nanometers\n ");
    }

    private static void runforCentimeterstoinches(Scanner input) {
        int centimeters;
        int inches;
        System.out.println("**Enter the number** ");
        centimeters = input.nextInt();
        inches = (int) (centimeters * 0.3937);
        System.out.println(centimeters + " centimeters is equal to " + inches + " inches\n ");
    }

    private static void runforCentimeterstomicrometers(Scanner input) {
        int centimeters;
        int micrometers;
        System.out.println("**Enter the number** ");
        centimeters = input.nextInt();
        micrometers = centimeters * 10000000;
        System.out.println(centimeters + " centimeters is equal to " + micrometers + " micrometers\n ");
    }

    private static void runforMeterstoinches(Scanner input) {
        int meters;
        int inches;
        System.out.println("**Enter the number** ");
        meters = input.nextInt();
        inches = (int) (meters * 39.37);
        System.out.println(meters + " meters is equal to " + inches + " inches\n ");
    }

    private static void runforMeterstofeet(Scanner input) {
        int meters;
        int feet;
        System.out.println("**Enter the number** ");
        meters = input.nextInt();
        feet = (int) (meters * 3.281);
        System.out.println(meters + " meters is equal to " + feet + " feet\n ");
    }

    private static void runforMeterstonanometers(Scanner input) {
        int meters;
        int nanometers;
        System.out.println("**Enter the number** ");
        meters = input.nextInt();
        nanometers = meters * 1000000000;
        System.out.println(meters + " meters is equal to " + nanometers + " nanometers\n ");
    }

    private static void runforMeterstomillimeters(Scanner input) {
        int meters;
        int millimeters;
        System.out.println("**Enter the number** ");
        meters = input.nextInt();
        millimeters = meters * 1000;
        System.out.println(meters + " meters is equal to " + millimeters + " millimeters\n ");
    }

    private static void runforMeterstocentimeters(Scanner input) {
        int meters;
        int centimeters;
        System.out.println("**Enter the number** ");
        meters = input.nextInt();
        centimeters = meters * 100;
        System.out.println(meters + " meters is equal to " + centimeters + " centimeters\n ");
    }

    private static void runformKilometerstometers(Scanner input) {
        int kilometers;
        int meters;
        System.out.println("**Enter the number**");
        kilometers = input.nextInt();
        meters = kilometers * 1000;
        System.out.println(kilometers + " Kilometers is equal to " + meters + " meters\n ");
    }

    private static void runforKilometerstSetometers(Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


