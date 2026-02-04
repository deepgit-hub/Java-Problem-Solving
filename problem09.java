import java.util.Scanner;
import java.lang.System;
class problem09
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String to know its length : ");
        String string = scan.nextLine();
        System.out.print("The length of the Entered string is : "+string.length());
    }
}
