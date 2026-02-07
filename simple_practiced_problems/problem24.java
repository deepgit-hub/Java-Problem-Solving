import java.lang.System;
import java.util.Scanner;
class problem24
{
    static int cube(int n)
    {
        return n*n*n;
    }
    static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter a number to fing it's Cube : ");
       int n = scan.nextInt();
       int cube = cube(n);
       System.out.print("The Cube of the entered number "+n+" is "+cube);
    }

}
