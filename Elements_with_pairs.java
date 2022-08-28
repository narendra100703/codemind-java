import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        if(n%2==0)
        {
            for(int i=0;i<n;i++)
            {
                System.out.format("%d ",a[i]);
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                System.out.format("%d ",a[i]);
            }
            System.out.println("0");
        }
    }
}