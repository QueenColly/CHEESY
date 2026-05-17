import java.util.Arrays;
public class TwoString{
public static void main(String[]args){


//output = [RYan,yous]

String[] names = {"Ryan","Kieran","Jason", "Yous"};

    int count = 0;
for(int i = 0; i< names.length; i++){
    if(names[i].equalsIgnoreCase("Ryan") || names[i].equalsIgnoreCase("Jason")){
        count += 1;
}
}
         String[] given = new String[count];
    int index = 0;
for(int i =0; i< names.length;i++){
    if(names[i].equalsIgnoreCase("Ryan") || names[i].equalsIgnoreCase("jason")){
        given[index]= names[i];
        index += 1;
}
}
    System.out.println(Arrays.toString(names));

    System.out.println(Arrays.toString(given));

}
}


