import java.util.*;

public class ValidParenthesis {

    public static boolean Valid(String str)
    {
        Stack <Character>ss=new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
            {
                ss.push(ch);
            }
            else if(ch==')'||ch=='}'||ch==']')
            {
                if(ss.isEmpty())
                {
                    return false;
                }

                char top=ss.pop();

                if((ch==')'&& top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='['))
                {
                    return false;
                }
            }
        }
        if(ss.isEmpty())
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str="({})";
        System.out.println(Valid(str));
    }
}
