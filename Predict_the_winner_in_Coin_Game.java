import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        if(m%2==0 || n%2==0)
        {
            System.out.println("Player 1");
        }
        else
        {
             System.out.println("Player 2");
        }
    }
}