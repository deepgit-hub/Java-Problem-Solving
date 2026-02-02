import java.lang.System;
import java.util.Scanner;
class problem10
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int helmet_fine=0;
        int license_fine=0;
        int under_age=0;
        for (int i = 1;i<=10;i++)
        {
            System.out.println("Rider "+i);
            System.out.print("Enter your age : ");
            int age = scan.nextInt();
            if(age<18)
            {
                under_age+=1;
                System.out.println("You are not eligible!!!");
                continue;
            }
            System.out.print("Enter 0 if rider wears helmet or 1 if rider didn't: ");
            int helmet = scan.nextInt();
            if(helmet==1)
            {
                helmet_fine+=1;
            }
            System.out.print("Enter 0 if rider has lisence or 1 if rider didn't: ");
            int lisence = scan.nextInt();
            if(lisence==1)
            {
                license_fine+=1;
            }
        }
        System.out.println("-----------------Final Report----------------");
        System.out.println("UnderAge Riders are : " + under_age);
        System.out.println("Fine for no Helmet  : " + helmet_fine);
        System.out.println("Fine for no License : " + license_fine);

    }
}           
