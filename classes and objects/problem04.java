import java.lang.System;
import java.util.Scanner;
class problem04
{
    String brand="";
    int price=0;
    int storage=0;
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        practice p1 = new practice();
        practice p2 = new practice();
        practice p3 = new practice();
        System.out.print("Enter the brand of first mobile : ");
        p1.brand = scan.nextLine();
        System.out.print("Enter the brand of second mobile : ");
        p2.brand = scan.nextLine();
        System.out.print("Enter the brand of third mobile : ");
        p3.brand = scan.nextLine();
        System.out.println();
        System.out.print("Enter the price of first mobile : ");
        p1.price = scan.nextInt();
        System.out.print("Enter the price of second mobile : ");
        p2.price = scan.nextInt();
        System.out.print("Enter the price of third mobile : ");
        p3.price = scan.nextInt();
        System.out.println();
        System.out.print("Enter the storage of first mobile : ");
        p1.storage = scan.nextInt();
        System.out.print("Enter the storage of second mobile : ");
        p2.storage = scan.nextInt();
        System.out.print("Enter the storage of third mobile : ");
        p3.storage = scan.nextInt();
        System.out.println();
        if(p1.price>=p2.price && p1.price>=p3.price)
        {
            System.out.print("The First mobile is higher price!!!");
        }
        else if(p2.price>p1.price && p2.price>p3.price)
        {
            System.out.print("The Second mobile is higher price!!!");
        }
        else
        {
            System.out.print("The Third mobile is higher price!!!");
        }

    }

}
