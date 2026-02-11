import java.lang.System;
import java.util.Scanner;
class problem28
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Rows for First Matrix : ");
        int r1 = scan.nextInt();
        System.out.print("Enter the Columns for First Matrix : ");
        int c1 = scan.nextInt();
        int[][] A= new int[r1][c1];
        System.out.print("Enter the Rows for Second Matrix : ");
        int r2 = scan.nextInt();
        System.out.print("Enter the Columns for Second Matrix : ");
        int c2 = scan.nextInt();
        int[][] B= new int[r2][c2];
        System.out.println();
        System.out.println("First Matrix ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print("Enter the element for Row "+(i+1)+" column "+(j+1)+" : ");
                A[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Second Matrix ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print("Enter the element for Row "+(i+1)+" column "+(j+1)+" : ");
                B[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Elements in First matrix : ");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Elements in Second matrix : ");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }

    }
}
