import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        for(int i=a;i<=b;i++)
        {
            int rev=0;
            int temp=i;
            while(temp>0)
            {
                int r=temp%10;
                rev=(rev*10)+r;
                temp/=10;
            }
            if(i==rev)
            {
                System.out.format("%d ",i);
            }
        }
    }
}