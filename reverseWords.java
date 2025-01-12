class Solution {
    public String reverseWords(String s) {

        String ans="";
        for(int i=0;i<s.length();i++){
            StringBuilder result = new StringBuilder();
            while(i<s.length() &&  s.charAt(i)!=' '){
                result.append(s.charAt(i));
                i++;
            }

            if(result.length()!=0){
                ans = " "+result+ans;
            }
        }

        return ans.substring(1);
        
    }
}