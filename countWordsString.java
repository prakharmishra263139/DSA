public class countWordsString {

    public static int count(String str){
        int n = str.length();
        int count=0;

        if(str.charAt(0)!=' '){
            count++;
        }

        for(int i=1;i<n;i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;


    }
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(count(str));
    }
}
