package Dynamic_Programming;

public class SticklerThief {
    public static void main(String[] args) {
        int[] arr = new int[] {8, 2, 1, 1, 3, 5};

        System.out.println(FindMaxSum(arr, arr.length));
    }

    public static int FindMaxSum(int arr[], int n)
    {
        // Your code here
        if(n == 0) return 0;
        if (n == 1) return arr[0];
        if(n == 2) return Math.max(arr[0], arr[1]);
        
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        
        for(int i = 2; i < n; i++)
        {
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        }
        
        return dp[n - 1];
    }
}

