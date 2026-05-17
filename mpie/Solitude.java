public class Solitude {

  public static void main(String[] args){

   Scanner input = scanner(System.in);
 
 System.out.print("Enter first integer: ");
  int number1 = input.nextInt();

  System.out.print("Enter second integer: ");
   int number2 = input.nextInt();

  int sum = number1 + number2;

 int sub = number1 - number2;
 int mult = number1 * number2;
 int div = number1 / number2;

 System.out.print("Sum is %d%n" , sum);
}
   }
