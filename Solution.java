import java.util.*;

public class Solution {
    public static  int totalFruit(int[] fruits) {
        int n=fruits.length;

       /* Fruit Into Baskets
        Brute Force - TC-O(n^2)
        SC-O(3)
       */

        int maxLength=0;

        for(int i=0;i<n;i++){
            Set<Integer> st=new HashSet<>();
            for(int j=i;j<n;j++){
                st.add(fruits[j]);

                if(st.size()<=2){
                    maxLength=Math.max(maxLength,j-i+1);
                }else{
                    break;
                }
            }
        }

        return maxLength;
    }

    public static int solve(int[] fruits) {
        int n=fruits.length;
        int maxLength=0;

        /* Fruit Into Baskets
        TC-O(n+n)-
        SC-O(3)
       * */

        int left=0;

        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int right=0;right<n;right++){
            mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);

            while(mp.size()>2){
                mp.put(fruits[left],mp.get(fruits[left])-1);

                if(mp.get(fruits[left])==0){
                    mp.remove(fruits[left]);
                }
                left++;
            }

            maxLength = Math.max(maxLength,right-left+1);
        }

        return maxLength;


    }

    public static void main(String[] args) {
        int fruits[]={1,2,1};
        System.out.println(solve(fruits));
    }
}