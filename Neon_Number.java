import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sq=n*n,sum=0;
        while(sq!=0)
        {
            int r=sq%10;
            sum=sum+r;
            sq=sq/10;
        }
        if(sum==n)
        {
            System.out.println("Neon Number");
        }
        else
        {
             System.out.println("Not Neon Number");
        }
    }
}