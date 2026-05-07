import java.util.Scanner;
public class Prime{

public static void main(String [] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();



        for (int num = 2; num <= number; num++) {
            boolean isPrime = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
