import java.lang.System;
import java.util.Scanner;
class problem02
{
    public static boolean istrong(int n)
    {
        int num=n;
        int digit;
        
        int total_fact=0;
        while(num>0)
        {
            int fact=1;
            digit = num%10;
            for(int i=1;i<=digit;i++)
            {
                fact*=i;
            }
            total_fact+=fact;
            num=num/10;
        }
        return n==total_fact;
        
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Three Digit Number : ");
        int num=scan.nextInt();
        practice p = new practice();
        p.istrong(num);
        if(istrong(num))
        {
            System.out.print("Strong Number!!!");
        }
        else
        {
            System.out.print("Not a Strong Number!!!");
        }
    }
}
