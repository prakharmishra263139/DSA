import java.util.*;
public class spiralMatrix {
    public static List<Integer> printSpiral(int mat[][]){
        ArrayList<Integer>list = new ArrayList<>();
        int n = mat.length;
        int m=mat[0].length;

        int top=0;
        int left=0;
        int bottom =n-1;
        int right=m-1;

        while(top<=bottom && left<=right){
            // moving left to right
            for(int i=left;i<=right;i++){
                list.add(mat[top][i]);
            }
            top++;

            // moving top to bottom
            for(int i=top;i<=bottom;i++){
                list.add(mat[i][right]);
            }
            right--;

            //moving right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }
            // moving bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(mat[i][left]);
                }
                left++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10, 11,12},
                      {13, 14, 15,16}};

        List<Integer>ans=printSpiral(mat);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();


    }
}
