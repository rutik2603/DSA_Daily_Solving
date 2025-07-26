public class FirstLastOcc {
    public static int[] First(int arr[],int target)
    {
        int result[]={-1,-1};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                result[0]=i;
                break;
            }
        }

        for(int j=arr.length-1;j>=0;j--)
        {
            if(arr[j]==target)
            {
                result[1]=j;
                break;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int[] res = First(arr, 8); 
        System.out.println(res[0] + "," + res[1]);
    }
}
