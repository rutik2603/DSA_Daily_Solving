public class MissingNo {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int sum2=0;
        int fsum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum2+=nums[i];
            fsum=sum-sum2;
        }
        return fsum;
    }
    public static void main(String args[])
    {
        int nums[]={3,0,1};
        System.out.print(missingNumber(nums));
    }
}
