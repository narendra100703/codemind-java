import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,c,f=0;
        for(int i=1;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            if(n==a)
            {
                f=1;
            }
        }
        if(f==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}