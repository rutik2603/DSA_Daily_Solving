public class MoveZerotoEnd {

    public static void MoveZero(int arr[])
    {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[j]=arr[i];
                j++;
            }
        }
        while(j<arr.length)
        {
            arr[j]=0;
            j++;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,4,5,6};
        MoveZero(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
