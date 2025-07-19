public class ReverseString4 {

    public static String reverse(String str)
    {
        char ss[]=str.toCharArray();
        int start=0;
        int end=ss.length-1;
        while(start<end)
        {
            char temp=ss[start];
            ss[start]=ss[end];
            ss[end]=temp;

            start++;
            end--;
        }
        return new String(ss);
    }

    public static String reverseword(String str)
    {
        String word[]=str.split(" ");
        StringBuilder sb=new StringBuilder();

        for(String rrr:word)
        {
            String revwor=reverse(rrr);
            sb.append(revwor).append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String str="Let's take LeetCode contest";
        String revword=reverseword(str);
        System.out.print(revword);

    }
}
