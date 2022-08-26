import java.util.*;
class Solution{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double po=Math.pow(a,b);
        double mo=po%c;
        System.out.println((int)mo);
    }
}