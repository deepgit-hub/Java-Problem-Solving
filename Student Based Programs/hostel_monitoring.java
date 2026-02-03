import java.lang.System;
import java.util.Scanner;
class hostel_monitoring
{
    public static void main(String args[])
    {
        int allowed =0;
        int late_warning =0;
        int not_allowed = 0; 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Numer of Students in your hostel : ");
        int student_count = scan.nextInt();
        int[] s_c = new int[student_count];
        for(int i=0;i<student_count;i++)
        {
            System.out.println("Student "+(i+1));
            System.out.print("Enter the Entry time in 24hrs format : ");
            s_c[i] = scan.nextInt();
        }
        for(int j=0;j<student_count;j++)
        {
            if(s_c[j]<=18)
            {
                allowed+=1;
            }
            else if(s_c[j]>18 && s_c[j]<21)
            {
                late_warning+=1;
            }
            else if(s_c[j]>21)
            {
                not_allowed+=1;
            }
        }
        System.out.println("Hostel Entry Monitor System!!!");
        System.out.println("Allowed : "+allowed);
        System.out.println("Late warning : "+late_warning);
        System.out.println("Not allowed : "+not_allowed);
    }
}
