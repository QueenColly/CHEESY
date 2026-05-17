import java.util.Scanner;
public class HighestNumber{
public static void main (String[] args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int numberOne= inputCollector.nextInt();

    System.out.print("Enter second integer: ");
    int numberTwo = inputCollector.nextInt();

     if (numberOne > numberTwo){ 
    System.out.printf( "%d%n",numberOne);
    }

    if (numberTwo > numberOne){
    System.out.printf("%d%n", numberTwo);
}
  }
}
