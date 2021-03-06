/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16matrixfunction;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class HW16MatrixFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int rows;
        int columns;
        float[][] matrixA;
        float[][] matrixB;
        float[][] matrixC;
        float[][] matrixD;

        Scanner input = new Scanner(System.in);
        System.out.println(" ☀Hello☀ ");
        System.out.println(" My name is Sandy ");
        System.out.println("Welcome to the calculator to subtract matrixs");
        System.out.println("Enter the matrix dimesions");
        System.out.println("\n columns->");
        rows = input.nextInt();

        System.out.println("\n rows->");
        columns = input.nextInt();

        matrixA = new float[columns][rows];
        matrixB = new float[columns][rows];
        matrixC = new float[columns][rows];

        matrixD = new float[rows][columns];

        System.out.println("Enter the elements of the matrix");

        matrixA = readMatrixElements(columns, rows, "MATRIX A", input);
        matrixB = readMatrixElements(columns, rows, "MATRIX B", input);

        for (int i = 0; i < rows; i++) {
            System.out.println("\t");
        }
      
        System.out.println("MATRIX A");
        prettyPrintMatrix(columns, rows, matrixA);
        System.out.println("");
      

        System.out.println("MATRIX B");
        prettyPrintMatrix(columns, rows, matrixB);
        System.out.println("");
        transpose(rows, columns, matrixD, matrixA);
        for (int j = 0; j < columns; j++) {
            System.out.println("\t");
        }
       
        System.out.println("MATRIX D");
        prettyPrintMatrix(columns, rows, matrixD);
        System.out.println(""); 
        System.out.println(" <=The subtraction of matrices is => ");
        matrixC = subbTwoMatrices(columns, rows, matrixA, matrixB);

        prettyPrintMatrix(columns, rows, matrixC);
        
        System.out.println("");
    }
    public static float[][] readMatrixElements(int columns, int rows, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[columns][rows];
        for (int i = 0; i < columns; i++) {
            System.out.println(" = ROW Numbers " + (i + 1) + " = ");
            for (int j = 0; j < rows; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "] [" + (j + 1) + "] -> ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
        
    }

    public static void transpose(int rows, int columns, float[][] matrixD, float[][] matrixA) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixD[i][j] = matrixA[j][i];
            }
        }

    }

    public static float[][] subbTwoMatrices(int columns, int rows, float[][] matrixA, float[][] matrixB) {
        float[][] matrixC;
        matrixC = new float[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return matrixC;
    }
    public static void prettyPrintMatrix(int columns, int rows, float[][] matrix) {
        for (int i = 0; i < columns; i++) {
            System.out.println("");
            for (int j = 0; j < rows; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == columns - 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (rows - 1)) {
                    System.out.print("\t");
                }
                if (j == (rows - 1)) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == columns - 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print(" \t");
                    }
                }
            }
        }
        System.out.print("");
    }

    public static void printMatrix(int columns, int rows, float[][] matrix){
        for (int i = 0; i < columns; i++) {
            System.out.println("");
            for (int j = 0; j < rows; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.println("/ \t");
                    } else if (i == columns - 1) {
                        System.out.println("\\\t");
                    } else {
                        System.out.println("| \t");
                    }
                }

                System.out.println(matrix[i][j]);
                if (j > -1 && j < (rows - 1)) {
                    System.out.println("\t");
                }
                if (j == (rows - 1)) {
                    if (i == 0) {
                        System.out.println("\t\\");
                    } else if (i == columns - 1) {
                        System.out.println("\t/");
                    } else {
                        System.out.println("\t");
                    }
                }
            }
        }
        System.out.println("");
        
               
        System.out.println("------------------");
    }
}
    }
    
}
