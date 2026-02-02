import java.util.Scanner;
import java.lang.System;
class problem11{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int eligible_students=0;
        int not_eligible_students=0;
        for(int i=1;i<=10;i++)
        {
            System.out.print(" Student "+i+" Enter your attendence percentage : ");
            int percentage=scan.nextInt();
            if(percentage<75)
            {
                System.out.println("You are not eligible for Exam!!!");
                not_eligible_students+=1;
                continue;
            }
            else{
                eligible_students+=1;
            }

        }
        System.out.println("The Number of Eligible  Students are : "+eligible_students);
        System.out.print("The Number of Non Eligible  Students are : "+not_eligible_students);

    }
}
