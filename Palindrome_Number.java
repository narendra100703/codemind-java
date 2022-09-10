import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        int n,i;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            int rev=0,x;
            x=a[i];
            while(x>0)
            {
                int r=x%10;
                rev=(rev*10)+r;
                x/=10;
            }
            if(rev==a[i])
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}