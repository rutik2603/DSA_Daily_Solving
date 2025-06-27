import java.util.*;

public class SingleNumber2Leetcode {

    public static int Single(int arr[])
    {
        HashMap<Integer,Integer>freq=new HashMap<>();

        for(int num:arr)
        {
            freq.put(num,freq.getOrDefault(num, 0)+1);
        }

        for(int num:arr)
        {
            if(freq.get(num)==1)
            {
                return num;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]={1,0,1,0,1,0,99};
        System.out.println(Single(arr));
    }
}
