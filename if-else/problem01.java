import java.util.Scanner;
import java.lang.System;
class problem01
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String user_name="Deepak@123";
        String password="Deepak2911";
        int otp=493439;
        System.out.print("Enter your User name : ");
        String u_name=scan.nextLine();
        if(user_name.equals(u_name))
        {
            System.out.print("Enter your Password : ");
            String pass=scan.nextLine();
            if(password.equals(pass))
            {
                System.out.print("Enter otp : ");
                int o=scan.nextInt();
                if(otp==o)
                {
                    System.out.print("Login Successfully!!!");
                }
                else
                {
                    System.out.print("Incorrect OPT is Entered!!!");
                }

            }
            else
            {
            System.out.print("Incorrect Password was entered!!!");
            }
        }
        else
        {
            System.out.print("Incorrect Username  was entered!!!");
        }
}   }
