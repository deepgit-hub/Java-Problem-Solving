import java.lang.System;
import java.util.Scanner;
class problem04
{
    void multiplicationtable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
    public static void main(String args[])
    {
        practice p = new practice();
        p.multiplicationtable(89);
    }
}
