import java.util.*;
class Solution
{
    static int pal(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
      return rev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int sq2=pal(n)*pal(n);
        if(sq==pal(sq2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}