package Arrays;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[] {2, -8, 5, 7, -4, 3};
        System.out.println(maxSubarraySum(arr, arr.length));
    }

    static long maxSubarraySum(int arr[], int n){
        // Your code here
        long maxSum = arr[0], currSum = 0;
        
        for(int i  = 0; i < n; i++)
        {
            currSum += arr[i];
            if (currSum > maxSum) 
				maxSum = currSum;
			
			if (currSum < 0) 
				currSum = 0;
        }
        return maxSum;
    }
}
