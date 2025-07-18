public class ReverseString3 {

    public static String Reverse33(String s)
    {
        String word[]=s.replaceAll("\\s+"," ").split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=word.length-1;i>=0;i--)
        {
            sb.append(word[i]).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String args[])
    {
        String s = "  hello world  ";
        System.out.println(Reverse33(s));
    }
}
