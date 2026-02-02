import java.lang.System;
import java.util.Scanner;
class problem13{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Password : ");
        String password=scan.nextLine();
        if(password.equals("password") || password.equals("Password") || password.equals("12345678") || password.equals("87654321"))
        {
            System.out.print("The Password "+password+" you entered is very weak one...");
        }
        else if(password.length()>8 && password.length()<16)
        {
            System.out.print("The password must between 8 to 16 characters!!!");
        }
        else
        {
            System.out.print("Entered password is Strong Enough!!!");
        }

        
    }
}
