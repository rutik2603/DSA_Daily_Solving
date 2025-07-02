public class PeakInMountain {
    public static int Peak(int arr[])
    {
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,1,4,7,3,2,5};
        System.out.println(Peak(arr));
    }
}
