import java.util.Scanner;
import java.lang.System;
class problem6{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Name    : ");
        String name=scan.nextLine();
        System.out.print("Enter your Address : ");
        String add=scan.nextLine();
        System.out.print("Enter your college : ");
        String college=scan.nextLine();
        System.out.print("Your name is "+name+", you are studing at "+college+" and you are living in "+add);
    }
}
