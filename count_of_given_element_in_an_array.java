import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0,f=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                c++;
                f=0;
            }
        }
        if(f==0)
        {
            System.out.println(c);
        }
        else
        {
             System.out.println('0');
        }
        
    }
}