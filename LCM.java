import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        for(int i=1;i<=b;i++)
        {
            c=a*i;
            if(c%b==0)
            {
                System.out.println(c);
                break;
            }
        }
    }
}