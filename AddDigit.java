public class AddDigit {

    public static int Digit(int num)
    {
        while(num>9)
        {
            int sum=0;
            while(num>0)
            {
                sum=sum+(num%10);
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
    public static void main(String[] args) {
        int num=38;
        System.out.println(Digit(num));
    }
}
