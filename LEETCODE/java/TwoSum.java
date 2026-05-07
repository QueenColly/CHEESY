
public class TwoSum{
public static void main (String[] args){

    int[] myList = {2,3,4,5,6,};


    int max = myList[0];
    int min = myList[0];
for (int i = 1; i < myList.length; i++) {
    if (max < myList[i]) 
        max = myList[i];

     if(min > myList[i])
        min = myList[i];
    
}
    System.out.println();
    System.out.println(max+ "max is ");
     System.out.println(min + "min is ");

    int sum = max + min;
    System.out.println("The sum is " + sum);
}
}

   
