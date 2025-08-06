public class FinPricWithSpelDisLeetcode {

    public static int[] FinalPrice(int prices[])
    {
        int answer[]=new int[prices.length];
        for(int i=0;i<prices.length;i++)
        {
            boolean found=false;
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[i]>=prices[j])
                {
                    answer[i]=prices[i]-prices[j];
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                answer[i]=prices[i];
            }
        }
        return answer;
    }

    public static void main(String args[])
    {
        int prices[]={8,4,6,2,3};
        int result[]=FinalPrice(prices);
        for(int ans:result)
        {
            System.out.print(ans+" ");
        }
    }
}
