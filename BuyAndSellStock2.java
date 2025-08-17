import java.util.*;

public class BuyAndSellStock2 {

    public static int Max(int arr[])
    {
        int buy1=Integer.MAX_VALUE;
        int buy2=Integer.MAX_VALUE;
        int max=0;
        int fina=0;
        int profit=0;
        for(int i=0;i<arr.length;i++)
        {
            // if(arr[i]>buy1&&arr[i]>buy2)
            // {
                profit=arr[i]-buy1;
                max=Math.max(max,profit);
                fina+=max;
            
                profit=arr[i]-buy2;
                max+=Math.max(profit,max);
                fina+=max;
            // }
        }
        return fina;
    }
    public static void main(String[] args) {
        int arr[]={3,3,5,0,0,3,1,4};
        System.out.print(Max(arr));
    }
}
