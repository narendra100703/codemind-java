import java.util.*;
class SOlution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        int co=0;
        for(int i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                co++;
            }    
        }
        System.out.println(co);
    }
}