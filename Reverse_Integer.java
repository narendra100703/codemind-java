import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int rev=0;
        while(a!=0)
        {
            int r=a%10;
            rev=(rev*10)+r;
            a=a/10;
        }
        System.out.println(rev);
    }
}