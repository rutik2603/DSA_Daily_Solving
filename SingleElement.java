import java.util.*;

public class SingleElement {

    public static int Single(int arr[])
    {
        HashMap<Integer,Integer>freq=new HashMap<>();

        for(int num:arr)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
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
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        System.out.print(Single(arr));
    
    }
}
