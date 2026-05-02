import java.util.Scanner;

public class SumMaxMin{
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int integers = getValueFromUser(input,"integers");
    int max = integers;
    int min = integers;
   


    for(int number = 1 ; number < 10; number++){

   System.out.print("Enter a fine: ");
   
    int count = input.nextInt();
    

    if(count> max){
       max = count;}
    if(count < min){
        min = count;

}
   
}
    
    System.out.println("max is: "+max);
     System.out.println("min is: "+min);
       int sum = sumTwoNumbers( max, min);
    System.out.println("sum is:"+ sum);
}

  

    public static int getValueFromUser(Scanner input,String value){
    System.out.print("Enter"+value+":");
    int integers = input.nextInt();
    return integers;
}

    public static int sumTwoNumbers(int max,int min){
    int sum = max + min;
    return sum;
}
}
