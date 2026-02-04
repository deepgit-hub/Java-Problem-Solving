import java.util.Scanner;
import java.lang.System;
class problem3{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter First Numner : ");
        int a = scan.nextInt();
        System.out.print("Enter Seconde Numner : ");
        int b = scan.nextInt();
        System.out.print("Enter Third Numner : ");
        int c = scan.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.print("The Final Solution is : "+d/e);

    }
}
