import java.lang.System;
import java.util.Scanner;
class problem22
{
    static void square(int n)
    {
        int sq = n*n;
        System.out.print("The Square of entered number is : "+sq);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number to find it's Square : ");
        int n = scan.nextInt();
        square(n);
    }
}
