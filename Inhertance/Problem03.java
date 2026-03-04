import java.lang.System;
import java.util.Scanner;
class College
{
    College()
    {
        System.out.println("Don Bosco College");
    }
}
class Department extends College
{
    Department()
    {
        System.out.println("Computer Science");
    }
}
class Year extends Department
{
    Year()
    {
        System.out.println("Third Year");
    }
}
class Problem03
{
    public static void main(String args[])
    {
        Year c = new Year();

    }
}
