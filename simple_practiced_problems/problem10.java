import java.lang.System;
import java.util.Scanner;
class problem10
{
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a String : ");
    String string = scan.nextLine();
    System.out.print("Enter the position you want to display : ");
    int pos = scan.nextInt();
    System.out.print(string.charAt(pos));
    }
}
