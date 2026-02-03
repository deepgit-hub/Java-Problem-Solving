import java.lang.System;
import java.util.Scanner;
class practice
{
    public static void main(String args[])
    {
        for(int i=1;i<=100000;i++)
        {
            for(int j=1;j<=10;j++)
            {
                System.out.println(i+"*"+j+" = "+(i*j));
            }
            System.out.println();
        }
    }
}
