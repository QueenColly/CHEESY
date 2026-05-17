 import java.util.Scanner;
public class Pretty {

  public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in);
  
    System.out.println("What is your name?");
    String userInput = inputCollector.nextLine();
    System.out.println("How old are you?");
    int age = inputCollector.nextInt();
    System.out.printf("Hello %s!%nYou are %d year old. %n",userInput, age);
}
  }
