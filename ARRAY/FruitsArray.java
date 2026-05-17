import java.util.Scanner;
import java.util.Arrays;
public class FruitsArray{
public static void main(String[]args){

//String[] fruits ={"Orange","Apple","Banana"};
//
//if(fruit:fruits.equalsto){
//    System.out.println(fruit);
//
//}
//}
//}


    Scanner input = new Scanner(System.in);
   //   String name = input.nextLine();  

        int tracker= 0;
        String []names = new String[10];

        String[]given = new String[10];

    for(int index = 0; index< names.length; index++){
        System.out.print("Please enter a friend's name? ") ;
         names[index] = input.nextLine();       

        if (names[index].length() == 4){
        given[tracker] = names[index];
            tracker+= 1;
                }    

            }
 System.out.println(Arrays.toString(given));
        }
    }
