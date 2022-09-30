import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='.')
            {
                System.out.format("[%c]",a.charAt(i));
            }
            else
            {
                System.out.format("%c",a.charAt(i));
            }
        }
    }
}