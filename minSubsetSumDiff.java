import java.util.ArrayList;
import java.util.List;

public class minSubsetSumDiff {

    public List<Integer> subset(int array[], int n, int sum) {
        List<Integer> list = new ArrayList<>();
        boolean[][] dp = new boolean[n + 1][sum + 1];
        
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

      
        for (int j = 1; j < sum + 1; j++) {
            dp[0][j] = false;
        }

        // Fill the dp table
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (array[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - array[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Collect all possible sums from 0 to sum / 2
        for (int j = 0; j < sum + 1; j++) {
            if (dp[n][j]) {
                list.add(j);
            }
        }
        return list;
    }

    public int min(int array[], int n) {
        int sum = 0;
        for (int s : array) {
            sum += s;
        }

        List<Integer> range = subset(array, n, sum / 2);

        // initialization of min
        int min = Integer.MAX_VALUE;
        for (int p : range) {
            min = Math.min(min, sum - 2 * p);
        }

        return min;
    }

    public static void main(String[] args) {
        minSubsetSumDiff mp = new minSubsetSumDiff();
        int array[] = {1, 6, 11, 5};
        int n = array.length;

        int ans = mp.min(array, n);
        System.out.println("The minimum subset sum difference is: " + ans);
    }
}
