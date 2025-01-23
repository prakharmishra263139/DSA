import java.util.*;
public class reverseString {
    public static String  reverse(String str){
        String ans = "";
        int n =str.length();

        for(int i=n-1;i>=0;i--){
            ans =ans+str.charAt(i);
        }

        return ans;

    }
    public static void main(String[] args) {

        String str ="Prakhar Mishra";
        System.out.println(reverse(str));
    }
}
