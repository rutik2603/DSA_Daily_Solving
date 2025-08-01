import java.util.*;

public class MinimumInRotatedArray {

    public static int mini(int arr[])
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,5,4};
        System.out.print(mini(arr));
    }
}
