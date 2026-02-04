import java.lang.System;
import java.util.Scanner;
class practice
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String string = scan.nextLine();
        System.out.print("Uppercase of the String is : "+string.toUpperCase());
        System.out.print("Lowercase of the String is : "+string.toLowerCase());
    }
}
