import java.util.*;

public class InterSectionOfTwoArray {

    public static int[] Intersection(int arr1[],int arr2[])
    {
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>resultSet=new HashSet<>();

        for(int num:arr1)
        {
            set.add(num);
        }
        for(int num:arr2)
        {
            if(set.contains(num))
            {
                resultSet.add(num);
            }
        }
        int count=0;
        int result[]=new int[resultSet.size()];
        for(int num:resultSet)
        {
            result[count++]=num;
        }
        return result;
    }
    public static void main(String args[])
    {
        int arr1[]={1,2,2,1};
        int arr2[]={2,2};
        int answ[]=Intersection(arr1, arr2);
        System.out.print(Arrays.toString(answ));
    }
}
