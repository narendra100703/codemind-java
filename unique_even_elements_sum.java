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
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=9999;
                }
            }
            if(a[i]!=9999 && a[i]%2==0)
            {
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}