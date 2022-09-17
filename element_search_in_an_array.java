import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int i,b;
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        b=s.nextInt();
        int c=0;
        for(i=0;i<n;i++)
        {
            if(b==a[i])
            {
              c=1;
            }
        }
        if(c==1)
        {
              System.out.println("True");
        }
        else
        {
              System.out.println("False");
        }
    }
}