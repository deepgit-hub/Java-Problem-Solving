package practice;
import java.util.Scanner;
class Problem06
{
	int accountnumber;
	int accountbalance;
	String accountholdername;
	Practice(String accountholdername,int accountnumber,int accountbalance)
	{
		this.accountholdername = accountholdername;
		this.accountnumber = accountnumber;
		this.accountbalance=accountbalance;
		
	}
	void deposit(int amount)
	{
	
		this.accountbalance+=amount;
		
	}
	void withdraw(int withdrawamount)
	{
		if(this.accountbalance>=withdrawamount)
		{
			this.accountbalance-=withdrawamount;
			System.out.println("Balance After withdraw : "+this.accountbalance);
		}
		else
		{
			System.out.println("Insufficient account Balance"+this.accountbalance);
		}
	}
	void display()
	
	{
		System.out.println("Your Account Balance is : "+accountbalance);
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Practice p = new Practice("Deepak",748514,1000);
		System.out.print("Enter amount for deposit : ");
		int amount = scan.nextInt();
		if(amount<0)
		{
			System.out.println("The Deposit Amount should not be in Negative");
		}
		else {p.deposit(amount);}
		System.out.print("Enter amount for withdraw : ");
		int withdrawamount = scan.nextInt();
		if(withdrawamount<0)
		{
			System.out.println("The Withdraw Amount should not be in Negative");
		}
		else {p.withdraw(withdrawamount);}
		
		p.display();
	}
}
