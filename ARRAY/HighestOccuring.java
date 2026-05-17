public class HighestOccuring {
    public static void main(String[] args) {
        int[] list = {2,1,2,5,2,4};

    int mode = [0];
    int highCount = [0]; 
      
    System.out.print(highestNumber(int[] list));

}

    public static int []highestNumber(int[] list){
    
    for(int index = 0; index < list.length; index++){
       int count = 0;

    for(int value = 0; value< list.length; value++){
        if(list[value] == list[index])
            count++;
}

    if(count > HighCount ){
        highCount = count;
        mode = list[index];
}

}
    return mode;
}
}

