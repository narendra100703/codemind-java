import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int sum=0,pdt=1,temp=a;
        while(temp!=0)
        {
            int r=temp%10;
            sum=sum+r;
            pdt=pdt*r;
            temp=temp/10;
        }
        if(sum==pdt)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}