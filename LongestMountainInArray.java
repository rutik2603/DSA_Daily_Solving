public class LongestMountainInArray {

    public static int LongestLength(int arr[])
    {
        int maxLen=0;
        int left=0;
        int right=0;
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                left=i;
                while(left>0 && arr[left-1]<arr[left])
                {
                    left--;
                }

                right=i;
                while(right<arr.length-1 && arr[right]>arr[right+1])
                {
                    right++;
                }
            }
            int currLen=right-left+1;
            maxLen=Math.max(currLen,maxLen);
        }
        return maxLen;
    }

    public static void main(String args[])
    {
        int arr[]={2,1,4,7,3,2,5};
        System.out.println(LongestLength(arr));
    }
}
