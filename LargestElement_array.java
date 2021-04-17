/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 

/**
 *
 * @author ssyed
 */
public class scanner {
public class CountMax {

    public static void main(String [] args) {
    //Create scanner object
    Scanner input = new Scanner(System.in);

    //Obtain user input 
    System.out.println("Enter numbers: ");
    int num = input.nextInt(); 
    int array[] = new int[num]; 

    //loop through array
    int max = array[0];
    int count = 1;
        for (int i = 0; i < array.length; i++) { 
            array[i] = num; 
            if(array[i] > max) {
                max = array[i];
                count = 1;
            } else if(array[i] == max) {
                count++;
            }
        }
    //output results
    System.out.println("The largest number is " + max);
    System.out.println("The occurrence count of the largest number is " + count);
}}
    
    
}
