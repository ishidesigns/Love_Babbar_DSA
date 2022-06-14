package Arrays;
import java.util.*;
public class ReverseArray {
    public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- > 0)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0; i < n; i++)
		        arr[i] = sc.nextInt();
		  
		    for(int i = arr.length - 1; i >= 0; i--)
		        System.out.print(arr[i] + " "); 
		        
		    System.out.println();
		}
	}
}
