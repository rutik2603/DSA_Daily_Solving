public class RotateArray {

    public static void Rotate(int arr[],int k)
    {
        int temp[]=new int[arr.length];
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            temp[(i+k)%n]=arr[i];
        }

        for(int i=0;i<temp.length;i++)
        {
            arr[i]=temp[i];
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        Rotate(arr,3);

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
