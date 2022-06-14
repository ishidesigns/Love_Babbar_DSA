package Arrays;
class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}    
public class MinMaxElement {
    public static void main(String[] args) {
        long[] arr = new long[] {3, 2, 1, 56, 10000, 167};
        
        pair p = getMinMax(arr, arr.length);
        System.out.println(p.first + " " + p.second);
    }

    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long maxVal = a[0], minVal = a[0];
        for(int i = 0; i < n; i++)
        {
            if(a[i] > maxVal)
                maxVal = a[i];
                
            if(a[i] < minVal)
                minVal = a[i];
        }
        return new pair(minVal, maxVal);
    }
}
