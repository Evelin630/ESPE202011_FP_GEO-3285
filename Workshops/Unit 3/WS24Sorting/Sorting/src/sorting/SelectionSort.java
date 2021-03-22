/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Sony
 */
public class SelectionSort {
    
    public int[] sort(int[] unsortedArray){
        int size = unsortedArray.length;
        int minumunIndex;
        
        for (int i = 0 ; i < size -1; i++){
           minumunIndex = i;
           for(int j = i+1; j < size; j++)
                if (unsortedArray [j] <  unsortedArray[minumunIndex]){
                    minumunIndex = j;
                    
        }
            //swap
           pos = unsortedArray [minumunIndex];
           unsortedArray [minumunIndex] = unsortedArray [i];
           unsortedArray [i] = pos;
           
           
    }
        
    return unsortedArray;
    
}
    
    
}

