class NumberOfSegment
{
    public static int Seg(String str)
    {
        if(str==null||str.trim().isEmpty())
        {
            return 0;
        }

        String str2[]=str.trim().split("\\s+");
        return str2.length;
    }

    public static void main(String args[])
    {
        String str="Hello, my name is John";
        System.out.print(Seg(str));
    }
}