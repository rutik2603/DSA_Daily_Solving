import java.util.*;

public class LuckyNumInArray {

    public static int Lucky(int arr[])
    {
        Arrays.sort(arr);
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            int num=arr[i];
            freq.put(num,freq.getOrDefault(num, 0)+1);
        }

        for(int i=arr.length-1;i>=0;i--)
        {
            int num=arr[i];
            if(freq.get(num)==num)
            {
                return num;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={2,2,2,3,3};
        System.out.println(Lucky(arr));
    }
}
