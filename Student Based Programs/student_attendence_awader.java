import java.lang.System;
import java.util.Scanner;
class practice
{
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);
    int strict_warning =0;
    int low_attendence = 0;
    int eligible =0;
    int awarded = 0;
    System.out.print("Enter the Number of Students : ");
    int student_count = scan.nextInt();
    int[] s_c = new int[student_count]; 
    for(int i=0;i<student_count;i++)
    {
        System.out.println("Student : "+(i+1));
        System.out.print("Enter how many days you present out of 30 Days : ");
        s_c[i] = scan.nextInt();
    }
    for(int j=0;j<student_count;j++)
    {
        if(s_c[j]<15)
        {
            strict_warning+=1;
        }
        else if(s_c[j]>15 && s_c[j]<20)
        {
            low_attendence+=1;
        }
        else if(s_c[j]>20)
        {
            eligible+=1;
        }
        else if(s_c[j]==30)
        {
            awarded+=1;
        }
    }
    System.out.println("count of Strict Warning Students : "+strict_warning);
    System.out.println("count of low attendence Students : "+low_attendence);
    System.out.println("count of Eligible Students : "+eligible);
    System.out.println("count of Awarded Students : "+awarded);
}
}
