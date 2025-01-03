public class subsetSumCount {

    public int countSubsets(int array[], int N, int sum) {
        int dp[][] = new int[N + 1][sum + 1];

        for (int i = 0; i <= N; i++) {
            dp[i][0] = 1;
        }

        for (int j = 1; j <= sum; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (array[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - array[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[N][sum];
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 8, 10};
        int sum = 10;
        int n = array.length;

        subsetSumCount counter = new subsetSumCount();
        int result = counter.countSubsets(array, n, sum);

        System.out.println("Count of subsets with the given sum: " + result);
    }
}
