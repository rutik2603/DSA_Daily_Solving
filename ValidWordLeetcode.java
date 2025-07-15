public class ValidWordLeetcode {

    public static boolean isValid(String word)
    {
        if(word.length()<3)
        {
            return false;
        }

        boolean vow=false;
        boolean con=false;
        boolean spch=false;

        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);

            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            {
                char cc=Character.toUpperCase(ch);
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                {
                    vow=true;
                }
                else
                {
                    con=true;
                }
            }
            else if(ch>='0'&&ch<='9')
            {

            }
            else
            {
                spch=true;
            }
        }
        return !(spch)&&vow&&con;
    }

    public static void main(String args[])
    {
        String word = "234Adas";
        System.out.print(isValid(word));
    }
}
