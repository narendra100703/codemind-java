import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int e=0,o=0;
        while(n>0)
        {
            int r=n%10;
            if(r%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
            n=n/10;
        }
        if(o==0)
        System.out.println("Even");
        else if(e==0)
        System.out.println("Odd");
        else
        System.out.println("Mixed");
    }
}