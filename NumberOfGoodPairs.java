import java.util.*;

/*Given an array of integers nums, return the number of good pairs.

 A pair (i, j) is called good if nums[i] == nums[j] and i < j.*/

public class NumberOfGoodPairs {

    public static int Pairs(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j]&i<j)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,3};
        System.out.print(Pairs(arr));
    }
}
