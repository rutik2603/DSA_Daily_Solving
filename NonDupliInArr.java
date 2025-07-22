import java.util.*;

class NonDupliInArr
{
    public static int ssr(int arr[])
    {
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.print(ssr(arr));
    }
}