//7.12 (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
//Write an application that inputs ten numbers, each between 10 and 100, both inclusive. 
//Save each number that was read in an array that was initialized to a value of -1 for all elements.
// Assume a value of -1 indicates an array element is empty. 
//You are then to process the array, and remove duplicate elements from the array containing the numbers you input. 
//Display the contents of the array to demonstrate that the duplicate input values were actually removed. [Note: do not display the array elements where the value is -1.]
//


//import java.util.Arrays;
//import java.util.Scanner;
//
//public class DulicateElimination{
//public static void main(String[]args){
//
//    Scanner input = new Scanner(System.in);
//  //   System.out.print("Enter number : " );
//     int [] array = new int[10];
//    
//    int []number ;
//   int count = 0;
//    for (int index= 0; index < 10; index++){
//        System.out.print("Enter number : " );
//     number[index]= input.nextInt();
//    
//      
//
//         array[index] = number[index];
//  System.out.print(array[index]);
//}
//    
// count++;
//    System.out.print(count);
//
//}
//}

import java.util.Scanner;

public class DulicateElimination {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arrays = new int[10];

        // Collect inputs
        for(int index = 0; index < arrays.length; index++) {

            System.out.print("Enter number " + (index + 1) + ": ");
            arrays[index] = input.nextInt();
        }

        // Print inputs
        System.out.println("\nNumbers entered:");

        for(int array: arrays) {
            System.out.println(array);
        }
    }
}
