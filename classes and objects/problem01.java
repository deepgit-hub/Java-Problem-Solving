import java.lang.System;
import java.util.Scanner;
class problem01
{
    String name ="";
    String father_name ="";
    int age=0;
    int mobileno = 0;
    public static void main(String args[])
    {
        practice p1 = new practice();
        p1.name ="Deepak";
        p1.father_name="Loganatham";
        p1.age=19;
        p1.mobileno=5155586;
        System.out.println("Student 1 Details ");
        System.out.println("Student Name : "+p1.name);
        System.out.println("Student Father's Name : "+p1.father_name);
        System.out.println("Stuent age : "+p1.age);
        System.out.println("Student Mobile Number : "+p1.mobileno);
        System.out.println();
       
       
        practice p2 = new practice();
        System.out.println("Student 2 Details ");
        p2.name ="ChandraSekar";
        p2.father_name="SivaSupramani";
        p2.age=29;
        p2.mobileno=999999;
        System.out.println("Student Name : "+p2.name);
        System.out.println("Student Father's Name : "+p2.father_name);
        System.out.println("Stuent age : "+p2.age);
        System.out.println("Student Mobile Number : "+p2.mobileno);
        
    }

}
