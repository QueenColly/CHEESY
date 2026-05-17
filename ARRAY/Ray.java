//import java.util.Arrays;
import java.util.Scanner;


    public class Ray{
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    int[] array = new int[10];

    
        for(int index = 0; index < 10; index++){
        System.out.print("Enter scores "+ array.length +" values: ");

        int scores= input.nextInt();

   array[index] = scores;
   System.out.print(Array.toString(array[index]));

    
//      System.out.print(array[index]);
}
//    for(int index = 0; index < array.length;index++){
//    System.out.print();
//}

}
}



public class HighestOccuring {
    public static void main(String[] args) {
//        int[] list = {2,1,2,5,2,4};

        int mode = list[0];
        int maxCount = 0;

        for (int index = 0; index < data.length; indfex++) {
            int count = 0;

            for (int value = 0; value < data.length; value++) {
                if (list[value] == list[index]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = list[index];
            }
        }

        System.out.println("Mode: " + mode);
    }
}
