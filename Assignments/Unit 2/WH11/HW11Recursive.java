/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursive;

import static javax.management.Query.plus;

/**
 *
 * @author Sony
 */
public class HW11Recursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println ("=====Welcome=====");
        System.out.println ("=====Evelyn=====");
              int [] [] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
 
        // initial call
        traverseRecursiveMatrix (m, 0, 0);
    }
 
    public static void traverseRecursiveMatrix (int [] [] m, int i, int j) {
 
        // I show the number (without line break)
        System.out.println(m [i] [j] + "");
 
        //
          if (i != m.length - 1 || j != m[i].length - 1) {
 
            // I indicate if I reach the end of the row
            if (j == m [i] .length - 1) {
                // I go to the next row
                i ++;
                // I restart the j
                j = 0;
                // Line break (format only)
                System.out.println ("");
            } else {
                // I go to the next column
                j ++;
            }
 
            // We call the function recursively
            traverseRecursiveMatrix (m, i, j);
 
        }


 
    }
    
}
