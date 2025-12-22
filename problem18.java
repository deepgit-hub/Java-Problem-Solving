import java.lang.System;
import java.util.Scanner;
class problem18
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of stuents in your class : ");
        int stuents_count = scan.nextInt();
        int marks[] = new int[stuents_count];
        int average_mark=0;
        int above_average=0;
        int total=0;
        for(int i=0;i<stuents_count;i++)
        {
            System.out.print("Enter Student "+(i+1)+" mark");
            marks[i]=scan.nextInt();
        }
        int high_mark=marks[0];
        for(int i=0;i<stuents_count;i++)
        {
            if(marks[i]>high_mark)
            {
                high_mark = marks[i];
            }
        }
        int low_mark=marks[0];
        for(int i=0;i<stuents_count;i++)
        {
            if(marks[i]<low_mark)
            {
                low_mark = marks[i];
            }
        }
        for(int i=0;i<stuents_count;i++)
        {
            total+=marks[i];
        }
        average_mark=total/stuents_count;
        for(int i=0;i<stuents_count;i++)
        {
            if(marks[i]>average_mark)
            {
                above_average+=1;
            }
        }
        System.out.println("Highest Mark          : "+high_mark);
        System.out.println("Lowest Mark           : "+low_mark);
        System.out.println("Average Mark          : "+average_mark);
        System.out.println("Above average students: "+above_average);

    }
}