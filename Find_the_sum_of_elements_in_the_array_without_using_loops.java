import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int sum=0,i=0;
        while(true)
        {
            sum+=a[i++];
            if (i<n)
            {
                 continue;
            }
            else
            {
            break;
            }
        }
        System.out.println(sum);
    }
}