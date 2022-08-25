import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int temp=a;
        int su=0;
        while(temp!=0)
        {
            int r=temp%10;
                su=(su*10)+r;
                temp=temp/10;
        }
        if(a==su)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}