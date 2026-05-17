public class MostOccuring {

    public static int mostOccuring(int[] array) {
//        int[] array = {1, 2, 2, 2, 3};

        int maxCount = 0;
        int highestOccurring = array[0];

        for (int index = 0; index < array.length; index++) {
            int count = 0;

            for (int inner = 0; inner < array.length; inner++) {
                if (array[index] == array[inner]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                highestOccurring = array[index];

       
            }
     
        }

        System.out.println(highestOccurring + " is the highest occurring number");
        System.out.println("It appears " + maxCount + " times");

            return maxCount;
    }







   


    public static void main(String[]args){
        int[]array = {1,2,2,2,3};
        
       System.out.println( mostOccuring(array)+ " is the number of times (2) occurs ");
}
}


