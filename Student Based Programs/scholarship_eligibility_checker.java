import java.lang.System;
import java.util.Scanner;
class problem14
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your mark : ");
        int mark = scan.nextInt();
        System.out.print("Enter your attendence percentage : ");
        int attendence = scan.nextInt();
        String result = (mark>=40) ? "Pass " : "fail";
        String scholarship = (mark>=90) && (attendence>=90) ? "Eligible" : "Not Eligible";
        System.out.println("Result Status : "+result);
        System.out.print("Scholarship Status : "+scholarship);
        
    }
}
