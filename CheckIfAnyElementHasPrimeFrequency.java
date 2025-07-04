import java.util.*;

public class CheckIfAnyElementHasPrimeFrequency {

    public static boolean PrimeFreq(int arr[])
    {
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int rr:arr)
        {
            freq.put(rr,freq.getOrDefault(rr, 0)+1);
        }

        for(int ssr:freq.values())
        {
            if(Prime(ssr))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean Prime(int num)
    {
        if(num<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4};
        System.out.print(PrimeFreq(arr));
    }
}
