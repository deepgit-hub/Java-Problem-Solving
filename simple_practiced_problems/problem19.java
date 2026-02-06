import java.util.Scanner;
import java.lang.System;
class problem19
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a three digit number : ");
    int num = scan.nextInt();
    int tem = num;
    int sum =0;
    while(tem>0)
    {
      int digit = tem%10;
      sum +=(digit*digit*digit);
      tem = tem/10;
    }
    if(num==sum)
    {
      System.out.print("The Entered Number is Amstrong Number : "+num);
    }
    else
    {
      System.out.print("The Entered Number is not Amstrong Number : "+num);
    }
  }
}
