import java.lang.System;
import java.util.Scanner;
class problem25
{
    static int greatest(int a,int b)
    {
        int c;
        if(a>b)
        {
            c=a;
        }
        else
        {
            c=b;
        }
        return c;
    }
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter two number to find which is greatest : ");
       int a = scan.nextInt();
       int b = scan.nextInt();
       int result = greatest(a,b);
       System.out.print("The greatest number is "+result);
    }

}
