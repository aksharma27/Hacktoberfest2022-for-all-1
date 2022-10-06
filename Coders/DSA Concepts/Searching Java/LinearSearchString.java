import java.util.*;
public class LinearSearchString{
    //linearSearch in a string
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextString();
        char target = in.nextString();
        searchString(str, target);
    }

    static boolean searchString(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i = 0;  i < str.length(); i++){
            char targetChar = str.charAt(i);
            if(targetChar == target){
                return true;
            }
        }
        return false;
    }
}