public class ReverseWordsInAString {

    public static String Reversee(String str)
    {
        String s1=str.trim();
        String s2[]=s1.split("\\s+");
        String result="";

        for(int i=s2.length-1;i>=0;i--)
        {
            result=result+" "+s2[i];

        }
        return result.trim();
    }
    public static void main(String[] args) {
        String str="the sky is blue";
        System.out.print(Reversee(str));
    }
}
