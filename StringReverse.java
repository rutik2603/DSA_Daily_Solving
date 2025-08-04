public class StringReverse {
    public static boolean RevStr(String str)
    {
        int start=0;
        int end=str.length()-1;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean palindrome2(String str2)
    {
        int n=str2.length();
        for(int i=0;i<str2.length()/2;i++)
        {
            if(str2.charAt(i)==str2.charAt(n-1-i))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="niti";
        String str2="mada";
        System.out.println(RevStr(str));
        System.out.print(palindrome2(str2));
    }
}
