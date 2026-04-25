package practice;
class Problem05
{
	int accountnumber;
	int accountbalance;
	String accountholdername;
	Problem05(String accountholdername,int accountnumber,int accountbalance)
	{
		this.accountholdername = accountholdername;
		this.accountnumber = accountnumber;
		this.accountbalance=accountbalance;
		
	}
	void deposit(int amount)
	{
	
		this.accountbalance+=amount;
		
	}
	void display()
	
	{
		System.out.print("Your Account Balance is : "+accountbalance);
		
	}
	
	public static void main(String args[])
	{
		Problem05 p = new Problem05("Deepak",748514,1000);
		p.deposit(500);
		p.display();
	
	}
}
