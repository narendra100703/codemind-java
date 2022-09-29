import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,a=0,b=1,c=0;
        n=s.nextInt();
        System.out.format("%d %d ",a,b);
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.format("%d ",c);
        }
    }
}