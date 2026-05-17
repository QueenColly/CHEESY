import java.util.Scanner;
public class StringValue{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
//        System.out.print("Enter numbers: ");
//        int number = input.nextInt() //.toLowerCase();
//
//        switch (color) {
//            case "green":
//                System.out.println("Go");
//                break;
//            case "yellow":
//                System.out.println("Get Ready");
//                break;
//            case "red":
//                System.out.println("Stop");
//                break;
//            default:
//                System.out.println("Invalid color");
//        }
//
//       
//    }
//}


    

      int number = 0;        
     while (number != 7){
    System.out.print("enter a number : ");
       number = input.nextInt();

    if(number == 7){
        System.out.println("Correct");
}
    else if (number > 7){
        System.out.println("above");
}

    else{
        System.out.println("Below");
}
}
         System.out.println("You entered 7. stop.");
}
}
  

//   
//     System.out.print("enter a number or enter 7 to stop: ");
//       int number = input.nextInt();
//
//    while(number != 7) {
//    System.out.print("enter a number or enter 7 to stop: ");
//        int userInput = input.nextInt();
//
//    number = userInput;
//    
//}
//      System.out.println("You have entered the number 7!!!...");
//}
//}
//
//
