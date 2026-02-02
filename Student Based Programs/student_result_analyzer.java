import java.lang.System;
import java.util.Scanner;
class problem17
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Students in you class : ");
        int students_count = scan.nextInt();
        int fail = 0;
        int pass = 0;
        int warning = 0;
        int marks[] = new int[students_count];
        int attendence[] = new int[students_count];
        for (int i=0;i<students_count;i++)
        {
            System.out.print("Student "+(i+1)+" Enter your Mark :");
            marks[i]=scan.nextInt();
            System.out.print("Enter your attendence : ");
            attendence[i]=scan.nextInt();
            System.out.println("-----------------------------------------------");

        }
        for (int i=0 ; i<students_count ; i++)
        {
            if(marks[i]<40)
            {
                fail+=1;
            }
            else if(marks[i]>=40 && attendence[i]>=75)
            {
                pass+=1;
            }
            else if(marks[i]>=40 && attendence[i]<75)
            {
                warning+=1;
            }
        }
        System.out.println("The Students Who got pass marks and has attendence : "+pass);
        System.out.println("The Students who got less than pass mark           : "+fail);
        System.out.print("The Students Who got  pass mark but low attendence : "+warning);

        
    }
}
