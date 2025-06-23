public class SubarraySum2 {

    public static int MaxSub(int arr[])
    {
        int currSum=arr[0];
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String args[])
    {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSub(arr));
    }
}
