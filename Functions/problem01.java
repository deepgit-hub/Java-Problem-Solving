import java.lang.System;
import java.util.Scanner;
class problem01
{
    void Sum()
    {
        int a=10;
        int b=5;
        System.out.print("The Sum is : "+(a+b));
    }
    void printstar()
    {
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void college()
    {
        System.out.print("Don Bosco College!!!");
    }
    void department()
    {
        System.out.print("Computer Science & Computer Application");
    }
    void goal()
    {
        System.out.print("To Become Incident Response Team Lead!!!");
    }
    public static void main(String args[])
    {
        practice p = new practice();
        p.Sum();
        System.out.println();
        p.printstar();
        System.out.println();
        p.college();
        System.out.println();
        p.department();
        System.out.println();
        p.goal();
    }
}

