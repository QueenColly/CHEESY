import java.util.Scanner;
public class Largestnumber{
public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.print("Collect first number: ");
    int largest = inputCollector.nextInt();
    

    System.out.print("collect second number: ");
    int secondNumber = inputCollector.nextInt();  
 if(secondNumber> largest)largest = secondNumber;
    

    System.out.print("collect third number: ");
    int thirdNumber = inputCollector.nextInt();
    if(thirdNumber > largest)largest = thirdNumber;

    System.out.print("collect fourth number: ");
    int fourthNumber =inputCollector.nextInt();
    if(fourthNumber > largest) largest = fourthNumber;

    System.out.println("collect fifthNumber: ");
    int fifthNumber = inputCollector.nextInt();
    if(fifthNumber > largest ) largest = fifthNumber;
    
   System.out.println("largest number is " + largest +".\n");
    


}
}
