class ConsecutiveCharacter
{
    public static int MaxChar(String str)
    {
        int count=1;
        int max=1;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                count++;
                max=Math.max(count,max);
            }
            else
            {
                count=1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str="abbcccddddeeeeedcba";
        System.out.print(MaxChar(str));
    }
}