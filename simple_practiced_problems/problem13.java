import java.lang.System;
import java.util.Scanner;
class practice
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String to reverse it : ");
        String string = scan.nextLine();
        String rev = " ";
        for(int i=(string.length())-1;i>=0;i--)
        {
            rev +=string.charAt(i);
        } 
        System.out.print("The Reversed String is : "+rev);
    }
}
