import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int su=0;
        while(a!=0)
        {
            int r=a%10;
                su=(su*10)+r;
                a=a/10;
        }
        System.out.println(su);
    }
}