import java.lang.System;
import java.util.Scanner;
class problem26
{
    static int greatest(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>a && b>c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three numbers to find the greatest one : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int result = greatest(a,b,c);
        System.out.print("The Greatest Number is : "+result);
    }
}
