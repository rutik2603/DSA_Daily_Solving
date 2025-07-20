import java.util.*;
public class ArmstrongNum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        int dup=num;
        int sum=0;

        while(num!=0)
        {
            int rem=num%10;
            int digit=rem*rem*rem;
            sum=sum+digit;
            num=num/10;
        }
        if(sum==dup)
        {
            System.out.println("Armstrong Number");
        }
        else 
        {
            System.out.println("Not Armstrong Number");
        }
    }
}
