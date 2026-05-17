import java.util.Scanner;

public class UserData{

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
     System.out.print("Enter a number: ");
   
    int integer1 = input.nextInt();
    

    int max = integer1;
    int min = integer1;
   


    for(int number = 1 ; number < 10; number++){

   System.out.print("Enter a fine: ");
   
    int integer = input.nextInt();
    

    if(integer> max){
       max = integer;
        
    }
    if(integer < min){
        min = integer;

}
    
//    
//
}
    
    System.out.println("max is: "+max);
     System.out.println("min is: "+min);
       int sum = max + min;
    System.out.println("sum is:"+ sum);
}

  }


