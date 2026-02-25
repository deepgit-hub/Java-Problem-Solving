package practice;
class Practice
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
		System.out.print("Cuurent Account Balance is : "+this.accountbalance);
	}
	void display()
	
	{
		System.out.print("Your Account Balance is : "+accountbalance);
	}
	
	public static void main(String args[])
	{
		Practice p = new Practice("Deepak",748514,1000);
		p.deposit(500);
	
	}
}
