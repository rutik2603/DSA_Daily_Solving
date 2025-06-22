import java.util.*;
public class BuyAndSellStock {

    public static int BuyOrSell(int arr[])
    {
        int BuyPrice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>BuyPrice)
            {
                BuyPrice=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>BuyPrice)
            {
                int profit=arr[i]-BuyPrice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else if(arr[i]<BuyPrice)
            {
                BuyPrice=arr[i];
            }
        }
        return maxprofit;
    }

   public static void main(String[] args) {
    int arr[]={7,1,5,3,6,15};
    System.out.print(BuyOrSell(arr));
   } 
}
