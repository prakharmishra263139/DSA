import java.util.HashSet;

public class stringUnique {
    public static  boolean isUnique(String a) {

        if(a==null || a.length()==0){
            return false;
        }
        HashSet<Character> st = new HashSet<>();

        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(st.contains(ch)){
                return false;
            }
            st.add(ch);
        }
        return true;
    }
    public static void main(String[] args) {
        String s ="Mish";
        System.out.println(isUnique(s));
    }
}
