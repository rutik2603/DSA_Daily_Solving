import java.util.*;

public class PrimeNoOrNot {

    public static void IsPrime(int num)
    {
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(num+" is Prime Number");
        }
        else
        {
            System.out.println(num+" is Not Prime Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        IsPrime(num);
    }
}
