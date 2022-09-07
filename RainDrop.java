import java.util.*;
class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        if(n%3==0)
        {
            System.out.format("Pling");
            c++;
        }
        if(n%7==0)
        {
            System.out.format("Plong");
            c++;
        }
        if(n%5==0)
        {
            System.out.printf("Plang");
            c++;
        }
        if(c==0)
        {
            System.out.println(n);
        }
    }
}