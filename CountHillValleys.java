import java.util.*;

public class CountHillValleys {
    public static int HillValley(int nums[])
    {
        // ArrayList<Integer>list=new ArrayList<>();
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(i==0||nums[i]!=nums[i-1])
    //         {
    //             list.add(nums[i]);
    //         }
    //     }
    //     int result[]=new int[list.size()];
    //     for(int i=0;i<list.size();i++)
    //     {
    //         result[i]=list.get(i);
    //     }
    //     int count=0;
    //     for(int i=1;i<result.length-1;i++)
    //     {
    //             if(result[i]>result[i-1]&&result[i]>result[i+1]||result[i]<result[i-1]&&result[i]<result[i+1])
    //             {
    //                 count+=1;
    //             }
    //     }
    //     return count;
    // }

     ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(i==0||nums[i]!=nums[i-1])
            {
                list.add(nums[i]);
            }
        }
        int count=0;
        for(int i=1;i<list.size()-1;i++)
        {
            int prev=list.get(i-1);
            int curr=list.get(i);
            int next=list.get(i+1);

            if((curr>prev&&curr>next)||(curr<prev&&curr<next))
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={2,4,1,1,6,5};
        System.out.print(HillValley(nums));
    }
}
