/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixdeclaration;


import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class MatrixDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello");
        System.out.println("Welcome");
        System.out.println("Autor Evelyn");
         
        System.out.println("Enter the matrix dimensions");
        System.out.print("\n columns ---> ");
   
        int columns;
        int rows;
        float[][] matrixA;
        float[][] matrixB;
        float[][] matrixC;
        float[][] t;
     
        Scanner input = new Scanner(System.in);
        rows = input.nextInt();

        System.out.print("\n rows ---> ");
        columns = input.nextInt();

        matrixA = new float[rows][columns];
        matrixB = new float[rows][columns];
        matrixC = new float[rows][columns];
        t = new float[rows][columns];

        System.out.println("Enter the elements of the matrix ");
        matrixA = Matrix(rows, columns, input);
        matrixB = matrix(rows, columns, "matrix B", input);
        

        for (int tab = 0; tab <= rows / 2; tab++) {
        System.out.println("\t");
        }
        System.out.println("--> matrix A");

        prettyPrintMatrix(rows, columns, matrixA);
        System.out.println("");

        System.out.println("--> matrix B");

        prettyPrintmatrix(rows, columns, matrixB);
        System.out.println("");

        transpose(columns, rows, t, matrixA);

        for (int tab = 0; tab <= rows / 2; tab++) {
        System.out.println("\t");
        }
        System.out.println("The Transpose of matrice is");

        prettyPrintMatrix(rows, columns, t);

        System.out.println("");
        System.out.println("The subtraction of matrices is");
        matrixC = subtractionTwoMatrices(rows, columns, matrixA, matrixB);

        prettyPrintMatrix(rows, columns, matrixC);

        System.out.println("");
        System.out.println("The sum of matrices is");

        matrixC = addTwoMatrices(rows, columns, matrixA, matrixB);

        prettyPrintMatrix(rows, columns, matrixC);

        System.out.println("");
        
       BasicMatrix.addTwoMatrices(columns, rows, matrixA, matrixB);
      
       
    
         {
             
             
       
         {
             
    
    }
 {
             }
 }
    }

    private static float[][] Matrix(int rows, int columns, Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static float[][] matrix(int rows, int columns, String matrix_B, Scanner input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void prettyPrintMatrix(int rows, int columns, float[][] matrixA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void prettyPrintmatrix(int rows, int columns, float[][] matrixB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void transpose(int columns, int rows, float[][] t, float[][] matrixA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static float[][] subtractionTwoMatrices(int rows, int columns, float[][] matrixA, float[][] matrixB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static float[][] addTwoMatrices(int rows, int columns, float[][] matrixA, float[][] matrixB) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class BasicMatrix {

        private static void addTwoMatrices(int columns, int rows, float[][] matrixA, float[][] matrixB) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public BasicMatrix() {
        }
    }
    }
       

