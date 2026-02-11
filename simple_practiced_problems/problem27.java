import java.lang.System;
import java.util.Scanner;
class problem27
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int reult[][] = new int[2][2];
        System.out.print("Enter the Elements for Matrix A ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print("Enter Element for Row "+(i+1)+" column"+ (j+1)+" :");
                A[i][j]=scan.nextInt();
            }
        }
        System.out.print("Enter the Elements for Matrix B ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print("Enter Element for Row "+(i+1)+" column"+ (j+1)+" :");
                B[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<2;k++)
                {
                    reult[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("The Multiplied Matrix ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(reult[i][j]+" ");
            }
            System.out.println();
        }
    }
}
