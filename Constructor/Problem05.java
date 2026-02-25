package practice;
class Problem05
{
	int accountnumber;
	int accoundbalance;
	String accountholdername;
	Practice(String accountholdername,int accountnumber,int accountbalance)
	{
		this.accountholdername = accountholdername;
		this.accountnumber = accountnumber;
		this.accoundbalance=accountbalance;
		
	}
	void deposit(int amount)
	{
	
		this.accoundbalance+=amount;
		System.out.print("Cuurent Account Balance is : "+this.accoundbalance);
	}
	
	public static void main(String args[])
	{
		Practice p = new Practice("Deepak",748514,1000);
		p.deposit(500);
	
	}
}
