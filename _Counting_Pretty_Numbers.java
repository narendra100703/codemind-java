import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n!=0)
        {
            int c=0,a,b,i,r;
            a=s.nextInt();
            b=s.nextInt();
            for(i=a;i<=b;i++)
            {
                r=i%10;
                if(r==2 || r==3 || r==9)
                {
                    c++;
                }
            }
            if(c>0)
            {
                System.out.println(c);
            }
        }
        
    }
}