import java.lang.System;
import java.util.Scanner;
class problem06
{
    void triangletype(int a,int b,int c)
    {
        if(a==b && b==c && c==b)
        {
            System.out.print("Equilateral");
        }
        else if(a==b || b==c || c==a)
        {
            System.out.print("Isosceles");
        }
        else{
            System.out.print("Scalene");
        }

    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        practice p = new practice();
        System.out.print("Enter First angle : ");
        int  a=scan.nextInt();
        System.out.print("Enter Second angle : ");
        int b=scan.nextInt();
        System.out.print("Enter Third angle : ");
        int c=scan.nextInt();
        p.triangletype(a,b,c);

    }
}
