import java.util.Scanner;
class solution {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        double c=scan.nextDouble();
        double f=32+(c*(1.8));
        System.out.format("%.2f",f);
    }
}