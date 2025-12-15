import java.lang.System;
import java.util.Scanner;
class problem5{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scan.nextLine();
        System.out.print("Enter mark1 : ");
        int m1 = scan.nextInt();
        System.out.print("Enter mark2 : ");
        int m2 = scan.nextInt();
        System.out.print("Enter mark3 : ");
        int m3 = scan.nextInt();
        double avg =(m1+m2+m3)/3.0;
        System.out.println("Name     :  "+name);
        System.out.print("Average  :  "+avg);
    }
}
