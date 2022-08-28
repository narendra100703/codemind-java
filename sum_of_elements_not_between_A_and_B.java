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
        int x,y,sum=0,ms=0;
        x=s.nextInt();
        y=s.nextInt();
        for(int i=0;i<n;i++)
        {
            ms=ms+a[i];
            if(a[i]>=x && a[i]<=y)
            {
                sum+=a[i];
            }
        }
        System.out.println(ms-sum);
    }
}