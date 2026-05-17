import java.util.Arrays;
public class Names{
public static void main(String[]args){


//output = [RYan,yous]

String[] names = {"Ryan","Kieran","Jason", "Yous"};
        int tracker= 0;
        String[]given = new String[2];
    for(int index = 0; index< names.length; index++){
        if (names[index].length() == 4){
        given[tracker] = names[index];
            tracker+= 1;
                }    

            }
 System.out.println(Arrays.toString(given));
        }
    }
