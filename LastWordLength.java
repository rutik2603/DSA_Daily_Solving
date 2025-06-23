public class LastWordLength {

    public static int leng(String str)
    {
        int i=str.length()-1;
        int count=0;
        while(i>=0&&str.charAt(i)==' ')
        {
            i--;
        }
        while(i>=0&&str.charAt(i)!=' ')
        {
            count++;
            i--;
        }
        return count;
    }

    public static void main(String args[])
    {
        String str="rutik  nimkarde     ";
        System.out.print(leng(str));
    }
}
