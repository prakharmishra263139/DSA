public class countASubsetDiff {

    public int count(int[] arr, int diff) {

        int sum = 0;
        int n = arr.length;

        // Calculate the total sum of elements in the array
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Check if the sum + diff is odd, return 0 if it is not possible to split
        if ((sum + diff) % 2 != 0) {
            return 0;
        }

        // Find the target sum for one subset
        int find = (sum + diff) / 2;

        // Create a 2D dp array to store the subset sum counts
        int[][] dp = new int[n + 1][find + 1];

        // Initialize the base case
        dp[0][0] = 1;

        // Fill the dp table using dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= find; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // The result is the value at dp[n][find]
        return dp[n][find];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        int diff = 1;

        countASubsetDiff solution = new countASubsetDiff();
        int result = solution.count(arr, diff);

        System.out.println("The number of subsets with the given difference is: " + result);
    }
}
