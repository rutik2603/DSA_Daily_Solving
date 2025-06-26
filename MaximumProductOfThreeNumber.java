import java.util.*;

public class MaximumProductOfThreeNumber {

    public static int MaxProduct(int arr[])
    {
        Arrays.sort(arr);
        int max1=1;
        int max2=1;
        int count=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            max1=arr[n-1]*arr[n-2]*arr[n-3];
            max2=arr[0]*arr[1]*arr[n-1];
            count=Math.max(max1,max2);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.print(MaxProduct(arr));
    }
}
