import java.lang.System;
import java.util.Scanner;
class problem18
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a Number to check whether it is palindrome or not : ");
    int num = scan.nextInt();
    int tem = num;
    int rev = 0;
    int digit ;
    while(tem>0)
    {
      digit = tem%10;
      rev= rev*10 + digit;
      tem = tem/10;
    }
    if(num==rev)
    {
      System.out.print("The Given Number "+num+" is PALINDROME!!!");
    }
    else
    {
      System.out.print("The Given Number "+num+" is not PALINDROME!!!");
    }
  }
}
