import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}