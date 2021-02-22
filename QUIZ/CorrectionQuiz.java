/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctionquiz;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class CorrectionQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
int totalOfAnimals = 0;
        String[] Animals;
        float[] weightanimal;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the number animals -> ");
        totalOfAnimals = scanner.nextInt();

        Animals = new String[totalOfAnimals];
        weightanimal = new float[totalOfAnimals];

        for (int i = 0; i < totalOfAnimals; i++) {
            scanner.nextLine();
            System.out.print(" Enter the name of Animal # " + i + " -> ");
            Animals[i] = scanner.nextLine();
            System.out.print(" Enter " + Animals[i] + " weight Animals ->");
            weightanimal[i] = scanner.nextFloat();
        }

        System.out.println(" animal  ->  \t    weight animal ");

        for (int i = 0; i < totalOfAnimals; i++) {
            System.out.println(Animals[i] + " ->  \t " + weightanimal[i]);
        }

    }