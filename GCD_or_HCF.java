import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,i,gcd=1;
        a=s.nextInt();
        b=s.nextInt();
        for(i=1;i<=a && i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}