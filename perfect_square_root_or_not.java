import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int f=0;
        for(int i=1;i<=a/2;i++)
        {
            if(i*i==a)
            {
               f=1;
            }
        }
        if(f==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}