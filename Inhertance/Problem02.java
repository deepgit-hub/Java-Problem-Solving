import java.lang.System;
import java.util.Scanner;
class Employee
{
    String name;
    double basicsalary;
    Employee(String name,double basicsalary)
    {
        this.name= name;
        this.basicsalary = basicsalary;
    }
    void display()
    {
        System.out.println("Name of the Employee : "+this.name);
        System.out.println("Basic Salary of an Employee : "+this.basicsalary);
        System.out.println("Annual Salary of an Employee : "+(this.basicsalary*12));

    }
    double calculatebonus()
    {
        return basicsalary * 0.10;
    }

}
class Manager extends Employee
{
    double bonus=0;
    Manager(String name,double basicsalary,int performence)
    {
        super(name,basicsalary);
        this.performence= performence;
    }
    if(this.performence>=4)
    {
        bonus = 0.20;
    }
    else if(this.performence==3)
    {
        bonus = 0.10;
    }
    @Override
    double calculatebonus()
    {
        return basicsalary * bonus;
    }

}
class Problem02
{
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = scan.nextLine();
        System.out.print("Enter Basic Salary : ");
        double salary = scan.nextDouble();
        System.out.print("Enter Performence rate : ");
        int performence = scan.nextInt();
        Manager m = new Manager(name,salary,performence);
        m.display();
        System.out.println("Performence Rating : "+performence);
        System.out.println("Bonus Amount : "+m.calculatebonus());


    }
}
