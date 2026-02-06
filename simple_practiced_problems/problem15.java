import java.lang.System;
import java.util.Scanner;
class problem15
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    int num = scan.nextInt();
    int sum = 0;
    int digit;
    while(num>0)
    {
      digit = num % 10;
      sum += digit;
      num  = num/10;
    }
    System.out.print("The Sum of these digits are : "+sum);
  }
}
