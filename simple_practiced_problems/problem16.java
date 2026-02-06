import java.lang.System;
import java.util.Scanner;
class problem16
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    int num = scan.nextInt();
    int count= 0;
    while(num>0)
    {
      count++;
      num = num / 10;
    }
    System.out.print("The  count of entered number is : "+count);

  }
}
