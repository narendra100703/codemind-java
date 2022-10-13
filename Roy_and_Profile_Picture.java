import java.util.*;
class Profile_pic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int l=sc.nextInt();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<l || b<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                if(a==b)
                {
                    System.out.println("ACCEPTED");
                }
                else
                {
                    System.out.println("CROP IT");
                }
            }
        }
    }
}