import java.util.*;

public class HappyNo {
    public static boolean isHappy(int n) {
        HashSet<Integer>set=new HashSet<>();
        while(n!=1)
        {
            int sum=0;
            while(n>0)
            {
                int rem=n%10;
                sum+=rem*rem;
                n=n/10;
            }
            n=sum;
            if(set.contains(n))
            {
                return false;
            }
            set.add(n);
        }
        return true;
    }
    public static void main(String args[])
    {
        int n=19;
        System.out.print(isHappy(n));
    }
}
