import java.lang.System;
import java.util.Scanner;
class problem15
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Amount of current you used : ");
        int usage = scan.nextInt();
        System.out.print("Enter how many days you have delayed to pay : ");
        int delay = scan.nextInt();
        String result = (usage<=100) ? "Low Usage" : (usage>100 && usage<=300) ? "Medium Usage " : "High Usage ";
        int fine = (delay==0)? 0 :(delay>=1 && delay<=5) ? 100 : 500;
        System.out.println("The Usage category is "+result);
        String p = (fine>0) ? "The fine amount is : "+fine : "You don't have any fine ";
        System.out.print(p);
    
    }
}
