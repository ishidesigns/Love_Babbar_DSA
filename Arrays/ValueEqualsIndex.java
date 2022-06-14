package Arrays;
import java.util.*;
public class ValueEqualsIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        ArrayList<Integer> list = valueEqualToIndex(arr, arr.length);
        for(int i : list)
            System.out.print(i + " ");
    }
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) 
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            int num = arr[i];
            int index = i + 1;
            if(num == index)
                list.add(index);
        }
        return list;
    }
}
