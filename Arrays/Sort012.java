package Arrays;
class Sort012{
    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		arr = new int[] {2, 2, 1, 1, 0, 1, 0, 0, 0, 2};
        int n = arr.length;
        
        sort012(arr, n);
        for(int i : arr)
        	System.out.print(i + " ");
    }

    public static void sort012(int a[], int n)
    {
        // code here 
        int left = 0, right = n - 1, k = 0;
        
        while(k <= right)
        {
            if(a[k] == 0)
            {
                swap(a, left, k);
                left++;
                k++;
            }
            
            else if(a[k] == 2)
            {
                swap(a, right, k);
                right--;
            }
            else
                k++;
        }
    }
    
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}