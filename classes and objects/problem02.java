import java.lang.System;
import java.util.Scanner;
class problem02
{
    String name ="";
    String father_name ="";
    int age=0;
    int mobileno = 0;
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        practice p1 = new practice();
        System.out.print("Enter Student name : ");
        p1.name = scan.nextLine();
        System.out.print("Enter Student fathers name : ");
        p1.father_name = scan.nextLine();
        System.out.print("Enter Student age : ");
        p1.age= scan.nextInt();
        System.out.print("Enter Mobile number : ");
        p1.mobileno = scan.nextInt();
        System.out.println("Student 1 Details ");
        System.out.println("Student Name : "+p1.name);
        System.out.println("Student Father's Name : "+p1.father_name);
        System.out.println("Stuent age : "+p1.age);
        System.out.println("Student Mobile Number : "+p1.mobileno);        
    }

}
