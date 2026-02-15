import java.lang.System;
import java.util.Scanner;
class problem03
{
    String name ="";
    int mark =0;
    int age =0;
    public static void main(String args[])
    {
        practice p1=new practice();
        practice p2=new practice();
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter Student 1 Name : ");
        p1.name= scan.nextLine();
        System.out.print("Enter Student 1 mark : ");
        p1.mark= scan.nextInt();
        System.out.print("Enter Student 1 age : ");
        p1.age= scan.nextInt();
        System.out.println();
        System.out.print("Enter Student 2 Name : ");
        scan.nextLine();
        p2.name= scan.nextLine();
        System.out.print("Enter Student 2 mark : ");
        p2.mark= scan.nextInt();
        System.out.print("Enter Student 2 age : ");
        p2.age= scan.nextInt();
        System.out.println();
        System.out.println("Student 1 name is "+p1.name+" ,age is "+p1.age+" and his marks are "+p1.mark);
        System.out.println("Student 2 name is "+p2.name+" ,age is "+p2.age+" and his marks are "+p2.mark);
        if(p1.mark>p2.mark)
        {
            System.out.print("Student 1 has higher mark than student 2");
        }
        else
        {
            System.out.print("Student 2 has higher mark than student 1");
        }
    }
}
