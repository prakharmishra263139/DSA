import java.util.*;

public class countAlpha {
    public static void count(String str) {
        Map<Character, Integer> mp = new HashMap<>();

        char[] ch = str.toCharArray();

        for (char i : ch) {
            if (mp.containsKey(i)) {
                mp.put(i, mp.get(i) + 1);
            } else {
                mp.put(i, 1);
            }
        }

        System.out.println(str + " : " + mp);
    }

    public static void main(String[] args) {
        String str = "PrakharMishra";
        count(str);
    }
}