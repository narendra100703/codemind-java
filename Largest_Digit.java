import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int max=0;
        while(a!=0)
        {
            int r=a%10;
            if(r>max)
            {
                max=r;
            }
            a=a/10;
        }
        System.out.println(max);
    }
}