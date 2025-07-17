class SubArraysumOn
{
    // public static int SubArray(int arr[])  // O(n^2)
    // {
    //     int max=0;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         int sum=0;
    //         for(int j=i+1;j<arr.length;j++)
    //         {
    //             sum+=arr[j];
    //             max=Math.max(sum,max);
    //         }
    //     }
    //     return max;
    // }

    public static int SubArray(int arr[])     // O(n)
    {
        int currsum=arr[0];
        int maxsum=arr[0];

        if(arr.length==1)
        {
            return arr[0];
        }
        for(int i=1;i<arr.length;i++)
        {
            currsum=Math.max(arr[i],currsum+arr[i]);
            maxsum=Math.max(currsum,maxsum);
        }
        return maxsum;
    }
    public static void main(String args[])
    {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(SubArray(arr));
    }
}