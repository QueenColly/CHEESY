public class StrinFigures{
    public static void main(String[]args){

        System.out.println(getSecHour(50));

//        System.out.print(
System.out.println(getString("eggroll"));
    }


    public static String getSecHour(double minute){
        double hours = minute / 60 ; 
        double seconds = 60 * minute;
        return "Seconds: " + seconds +","+"  hours: " + hours; 
   
    }

    public static String getString(String word){

        String newWord ="";
    for(int len= word.length() -1; len > 0; len--){
        newWord += word.charAt(len);
        
    }
    return newWord;  
    }
   
}

