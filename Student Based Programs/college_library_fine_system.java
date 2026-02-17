import java.lang.System;
import java.util.Scanner;
class college_library_fine_system
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Students came to return your books : ");
        int student_counts = scan.nextInt();
        int delay[] = new int[student_counts];
        int fine[] = new int[student_counts];
        int highest_fine = 0;
        int warning = 0;
        int total_fine = 0;
        for(int i=0;i<student_counts;i++)
        {
            System.out.println("Student   : "+(i+1));
            System.out.print("Enter how many days you delayed to return your books : ");
            delay[i] = scan.nextInt();
            if(delay[i]>=1 && delay[i]<=5)
            {
                fine[i] += delay[i] * 5;
            }
            else if(delay[i]>=6 && delay[i]<=10)
            {
                fine[i] += delay[i] * 10;
            }
            else if(delay[i]>10)
            {
                warning+=1;
            }
        }
        highest_fine = fine[0];
        for(int i=0;i<student_counts;i++)
        {
            if(fine[i]>highest_fine)
            {
                highest_fine = fine[i];
            }
            total_fine += fine[i];
        }
        System.out.println("Total Fine Collected   : "+total_fine);
        System.out.println("Highest Fine Collected : "+highest_fine);
        System.out.print("Students with warning  : "+warning);
        
    }
}
