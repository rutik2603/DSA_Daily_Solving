public class ValidMountainArray {

    public static boolean MounArray(int arr[])
    {
        int maxLen=0;
        int left=0;
        int right=0;

        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
            {
                left=i;
                while(left>0&&arr[left]>arr[left-1])
                {
                    left--;
                }

                right=i;
                while(right<arr.length-1&&arr[right]>arr[right+1])
                {
                    right++;
                }
            }
            maxLen=right-left+1;

            if(maxLen==arr.length)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={0,3,2,1};
        System.out.print(MounArray(arr));
    }
}
