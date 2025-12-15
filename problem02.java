import java.util.Scanner;
import java.lang.System;
class problem2{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name=scan.nextLine();
        System.out.print("Enter your age : ");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your address : ");
        String add=scan.nextLine();
        System.out.println("Your name is    : "+name);
        System.out.println("Your age  is    : "+age);
        System.out.print("Your address is : "+add);
    }
}
