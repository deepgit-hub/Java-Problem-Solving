import java.lang.System;
import java.util.Scanner;
class problem03
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        boolean allow = true;
        System.out.print("Enter your user name : ");
        String u_name = scan.nextLine();
        System.out.print("Enter your Password : ");
        String password = scan.nextLine();
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        System.out.print("Enter 0 if you have I'd or 1 if you don't have : ");
        int id = scan.nextInt();
        if(u_name.length()<5)
        {
            System.out.print("User name must consist more that 5 characters!!!");
            allow =false;
        }
        else if(password.length()<8)
        {
            System.out.print("Password must be more than 8 characters!!!");
            allow= false;
        }
        else if(age<18)
        {
            System.out.print("Age must be greater than 18 to Enter!!!");
            allow=false;
        }
        else if(id==1)
        {
            System.out.print("You must have id to enter!!!");
            allow=false;
        }
        if(allow)
        {
            System.out.print("You are Successfully verified!!!");
        }
        else
        {
            System.out.print("You are not allowed!!!");
        }



    }
}
