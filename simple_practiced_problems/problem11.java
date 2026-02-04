import java.lang.System;
import java.util.Scanner;
class problem11
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First String : ");
        String string1 = scan.nextLine();
        System.out.print("Enter the Second String : ");
        String string2 = scan.nextLine();
        if(string1.equals(string2))
        {
            System.out.print("Both the string you entered is true!!!");
        }
        else
        {
            System.out.print("The string you entered is mis matched!!!");
        }
    }
}
