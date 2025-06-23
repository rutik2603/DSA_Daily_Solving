public class SubarraySum {

    public static int MaxSub(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                count=Math.max(sum,count);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(MaxSub(arr));
    }
}
