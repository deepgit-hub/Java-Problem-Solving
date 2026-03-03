import java.lang.System;
import java.util.Scanner;
class Problem02
{
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter Student Name : ");
    String name = scan.nextLine();
    int[] subject = new int[5];
    int total =0;
    for(int i=0;i<5;i++)
    {
        System.out.print("Enter Subject "+(i+1)+" mark : ");
        subject[i]=scan.nextInt();
        total +=subject[i];
    }
    int average = total/5;
    if(average>90)
    {
        System.out.print("Grade A ");
    }
    else if(average>=75 && average<90)
    {
        System.out.print("Grade B");
    }
    else if(average>=50 && average<75)
    {
        System.out.print("Grade C");
    }
    else
    {
        System.out.print("You Failed in Exam");
    }
    }
}
