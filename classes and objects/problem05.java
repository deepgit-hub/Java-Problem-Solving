import java.lang.System;
import java.util.Scanner;
class problem05
{
    void strengthcheck(String pass)
    {
        int len = pass.length();
        if(len<6)
        {
            System.out.print("Weak!!!");
        }
        else if(len>=6 && len<10)
        {
            System.out.print("Medium!!!");
        }
        else{
            System.out.print("Strong!!!");
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        practice p = new practice();
        System.out.print("Enter your password : ");
        String  pass=scan.nextLine();
        p.strengthcheck(pass);
    }
}
