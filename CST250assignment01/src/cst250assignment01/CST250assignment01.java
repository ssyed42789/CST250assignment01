/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst250assignment01;

/**
 *
 * @author ssyed
 */
public class CST250assignment01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // TODO code application logic here
        int[] arr = new int[3];
        
        for (int index = 0; index<arr.length; index++) {
            arr[index] = index;
            System.out.println("index" + index + "equals" + arr[index]);
            
        }
        
        //Count the numbers of odd numbers within the array
        int count =0;
        for(int index = 0; index<arr.length; index++) {
            if(arr[index]% 2 !=0) {
                count = count + 1;
            }
        }
        
        System.out.println("Number of odd numbers in the array)" + count );
    }
    public static int[] dropOddNumbers(int[] arr) {
        //count the numbers of even numbers in arr
        //this is to know how big our resultArr should be
        //Count the number of even numbers within the array
        int count = 0;
        for(int index = 0; index<arr.length; index++) {
            if(arr[index]%2 == 0) {
                count = count + 1;
                
            }
            
        }
        // Allocates memory as big a the number of even numbers
        int[] resultArray = new int[count];
        int resultArrayindex = 0;
        
        // Copy even numbers over to the new Array
        
        for(int index = 0; index<arr.length; index++) {
            if(arr[index]% 2 != 0) {
                continue;
            }
            resultArray[resultArrayindex] = arr[index];
            resultArrayindex++;
            
            
            }
        
        //return the new array
        return resultArray;
    }
    
    public static void removeElement(int[] inputArray, int n) {
      int[] nArray = new int[2];
      int[] Array = new int[10];
      Array[0] = 5;
      Array[1] = 9;
      Array[2] = 15;
      Array[3] = 2;
      Array[4] = 1;
      
      int target = 2;
        int logicalSize = 5;
      
      for(int i = target; i < logicalSize - 1; i++) {
          Array[1] = Array[i+1];
          
      }
        int logicalsize = 5;
      Array[logicalsize - 1] = 0;
      
      logicalSize--;
      
    }
    public static int highestElement(int[] inputArray){
        
        //Initialize array  
        int [] arr = new int [] {25, 11, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
        return 2;
    }
}
    

        
        
    
   

