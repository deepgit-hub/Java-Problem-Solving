import java.lang.System;
import java.util.Scanner;
class problem20
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    int num = scan.nextInt();
    int tem = num;
    int fact =1;
    while(num>0)
    {
      fact = fact * num;
      num--;
    }
    System.out.print("The Factorial of the given number "+tem+" is "+fact);
  }
}
