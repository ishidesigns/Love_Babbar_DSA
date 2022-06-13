package Arrays;

public class PalindromicArray {
    public static void main(String[] args) 
    {
        int[] arr = new int[]{111,123,222,555,333};
        int[] arr2 = new int[]{121, 111, 555, 444};
        System.out.println(palinArray(arr, arr.length)); 
        System.out.println(palinArray(arr2, arr2.length));    
    }

    public static int palinArray(int[] a, int n)
    {
        //add code here.
        int ans = 1;
        for(int i : a)
        {
            String s = intToString(i);
            if(!check(s, s.length()))
            {
                ans = 0;
                break;
            }
        }
        return ans;
    }
    
    static boolean check(String str, int n)
    {
        for(int i = 0; i < n/2; i++)
        {
            if(str.charAt(i) != str.charAt(n - i - 1))
                return false;
        }
        return true;
    }
    
    static String intToString(int n)
    {
        return Integer.toString(n);
    }
}
