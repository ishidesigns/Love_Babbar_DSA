package Arrays;
class CyclicRotateBy1{
    public static void rotate(int arr[], int n)
    {
        int ele = arr[n-1];
        for(int i = n - 1; i > 0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = ele;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        rotate(arr, arr.length);
        for(int i : arr)
            System.out.print(i + " ");
    }
}