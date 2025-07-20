public class FirstOccurrence {

    public static int FirOccInString(String haystack,String needle)
    {
        int s1=haystack.length();
        int s2=needle.length();

        for(int i=0;i<=s1-s2;i++)
        {
            if(haystack.substring(i,i+s2).equals(needle))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        String haystack = "sadbutsad";
        String  needle = "but";

        System.out.print(FirOccInString(haystack,needle));
    }
}
