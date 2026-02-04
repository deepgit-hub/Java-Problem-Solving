import java.util.Scanner;
import java.lang.System;
class problem1{
    public static void main(String args[])
    {
        System.out.print("Enter Your Name : ");
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        System.out.print("Enter your age  : ");
        int age=scan.nextInt();
        System.out.println("Your name is : "+name);
        System.out.print("Your age is  : "+age);
    }
}
