package Arrays;
import java.util.*;
public class NegativeToEnd {
    public static void main(String[] args) {
        int[] arr = new int[]{-1,6,-4, 5, 7, -3, -4, 9};
        segregateElements(arr, arr.length);
        for(int i : arr)
            System.out.print(i + " ");
    }

    public static void segregateElements(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Integer> lp = new ArrayList<>();
        ArrayList<Integer> ln = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0)
                ln.add(arr[i]);
            else
                lp.add(arr[i]);
        }
        
        int j = 0;
        for(int i : lp)
        {
            arr[j] = i;
            j++;
        }
        for(int i : ln)
        {
            arr[j] = i;
            j++;
        }
    }
}
