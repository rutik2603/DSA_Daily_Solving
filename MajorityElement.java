import java.util.*;

public class MajorityElement {

    public static int Majority(int arr[])
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            return arr[arr.length/2];
        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr[]={2,2,1,1,1,2,2};
        System.out.print(Majority(arr));
    }
}
