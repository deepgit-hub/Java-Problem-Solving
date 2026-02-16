import java.lang.System;
import java.util.Scanner;
class problem03
{
    void biggestnum(int a,int b,int c)
    {
        if(a>=b && a>=c)
        {
            System.out.print("The Greatest Number is : "+a);
        }
        else if(b>a && b>c)
        {
            System.out.print("The Greatest Number is : "+b);
        }
        else{
            System.out.print("The Greatest Number is : "+c);
        }
    }
    public static void main(String args[])
    {
        practice p = new practice();
        p.biggestnum(14,56,78);
    }
}
