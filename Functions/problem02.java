import java.lang.System;
import java.util.Scanner;
class problem02
{
    void product1(int money)
    {
        System.out.print("Product 1 Purchased and its prize is "+money);
    }
    void product2(int money)
    {
        System.out.print("Product 2 Purchased and its prize is "+money);
    }
    void product3(int money)
    {
        System.out.print("Product 3 Purchased and its prize is "+money);
    }
    void product4(int money)
    {
        System.out.print("Product 4 Purchased and its prize is "+money);
    }
    public static void main(String args[])
    {
        practice p = new practice();
        p.product1(20);
        System.out.println();
        p.product2(25);
        System.out.println();
        p.product3(13);
        System.out.println();
        p.product4(17);
        System.out.println();
    }

}
