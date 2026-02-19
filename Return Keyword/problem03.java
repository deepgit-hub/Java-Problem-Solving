import java.lang.System;
import java.util.Scanner;
class problem03
{
    public static void strongnumber()
    {
        for(int i=1;i<1000;i++)
        {
            int total_fact=0;
            int l=i;
            while(l>0)
            {
                int digit;
                int fact=1;
                digit = l%10;
                for(int j=1;j<=digit;j++)
                {
                    fact*=j;
                }
                total_fact+=fact;
                
                l=l/10;
            }
            if(total_fact==i)
                {
                    System.out.println(i);
                }
        }
    }
    public static void main(String args[])
    {
        strongnumber();
        System.out.println();
    }
}
