
import java.util.Scanner;

class problem9 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Subject one mark : ");
        int m1 = scan.nextInt();

        System.out.print("Enter Subject two mark : ");
        int m2 = scan.nextInt();

        System.out.print("Enter Subject three mark : ");
        int m3 = scan.nextInt();

        System.out.print("Enter your attendance percentage : ");
        int per = scan.nextInt();

        double avg = (m1 + m2 + m3) / 3.0;

        if (per < 75) {
            System.out.println("You are Failed due to low attendance!");
        } else {

            System.out.print("Enter 1 if assignment NOT submitted, 0 if submitted : ");
            int assignment = scan.nextInt();

            if (assignment == 1) {
                avg -= 5;
            }

            if (avg >= 90) {
                System.out.println("Your Grade is A+  Congratulations!!!");
            } else if (avg >= 80) {
                System.out.println("Your Grade is A  Good!");
            } else if (avg >= 70) {
                System.out.println("Your Grade is B  Better!");
            } else if (avg >= 60) {
                System.out.println("Your Grade is C");
            } else {
                System.out.println("You are Failed!");
            }
        }
    }
}
