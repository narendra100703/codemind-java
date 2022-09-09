import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,n;
        b=s.nextInt();
        n=s.nextInt();
        for(a=1;a<=n;a++)
        {
            if(a%2==1)
            {
                int m=b*a;
                System.out.format("%d x %d = %d
",b,a,m);
            }
        }
    }
}