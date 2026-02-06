import java.lang.System;
import java.util.Scanner;
class problem17
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a Number to reverse it : ");
    int num = scan.nextInt();
    int rev =0;
    while(num>0)
    {
      int digit = num % 10;
      rev = rev * 10 + digit;
      num = num / 10;
    }
    System.out.print("The Reversed number is : "+rev);

  }
}  
