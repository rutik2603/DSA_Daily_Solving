public class ValidPalindrome {

    public static boolean Palin(String str)
    {
        String str2 = str.replaceAll("[^a-zA-Z0-9]","");
        String str3 = str2.toLowerCase();
        System.out.println(str3);

        int start=0;
        int end=str3.length()-1;
        while(start<end)
        {
            if(str3.charAt(start)!=str3.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama!";
        System.out.print(Palin(str));
    }
}
