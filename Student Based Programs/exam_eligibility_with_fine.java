import java.util.Scanner;
import java.lang.System;
class problem12{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your attendence percentage : ");
        int attendence=scan.nextInt();
        System.out.print("Enter How many days you came late : ");
        int late=scan.nextInt();
        int fine=0;
        int medical_cert=0;
        boolean allowed=true;
        if(late>3)
        {
            allowed=false;
        }
        else if(late>0)
        {
            fine=late*100;
        }
        if(attendence<75)
        {
            System.out.print("Enter 0 if you have medical Certificate or 1 if you don't have medical certificate : ");
            medical_cert=scan.nextInt();
            if(medical_cert==1)
            {
                allowed=false;
            }
        }
        if(allowed)
        {
            if(fine==0)
            {
                System.out.print("You are allowed to write exam!!!");
            }
            else if(fine>0)
            {
                System.out.print("You are allowd to write exam with fine "+fine);
            }
        }
        else
        {
            System.out.print("You are not allowed for the Exam!!!");
        }
        
    }
}
