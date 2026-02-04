import java.lang.System;
import java.util.Scanner;
class problem4{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Name          : ");
        String name = scan.nextLine();
        System.out.print("Enter your Score for 100 : ");
        double score = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter your Department    :");
        String dep = scan.nextLine();
        System.out.println("Your name is       "+name);
        System.out.println("Your score is      "+score/10);
        System.out.println("Your Department is "+dep);


    }
}
