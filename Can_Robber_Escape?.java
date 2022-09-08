import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int o=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                o++;
            }
        }
        if(o<=2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}