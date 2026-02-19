import java.lang.System;
import java.util.Scanner;
class problem01
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Customers : ");
        int customer_count = scan.nextInt();
        int[] purchase = new int[customer_count];
        int discount = 0; 
        int highest_purchase ;
        int gift = 0;
        for(int i=0;i<customer_count;i++)
        {
           System.out.println("Customer : "+(i+1));
           System.out.print("Enter the amount you purchased : ");
           purchase[i]= scan.nextInt();
        }
        for(int j=0;j<customer_count;j++)
        {
           if(purchase[j]>2000 && purchase[j]<5000)
           {
             discount += purchase[j]*10/100;
           }
           else if(purchase[j]>=5000 && purchase[j]<10000)
           {
             discount += purchase[j]*15/100;
           }
           else if(purchase[j]>=10000)
           {
             discount += purchase[j]*25/100;
             gift++;
           }

        }
        highest_purchase = purchase[0];
        for(int k=1;k<customer_count;k++)
        {
            if(highest_purchase<purchase[k])
            {
                highest_purchase= purchase[k];
            }
        }
        System.out.println("The total discount given : "+discount);
        System.out.println("The highest purchased is "+highest_purchase);
        System.out.println("Gift given : "+gift);
    
    }
}
