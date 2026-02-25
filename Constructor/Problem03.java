package practice;
class Problem03
{
	int empid;
	String name;
	Practice(String name,int empid)
	{
		this.name=name;
		this.empid=empid;
	}
	void display()
	{
		System.out.println("Employee Name : "+name);
		System.out.println("Employee id   : "+empid);
	}
	public static void main(String args[])
	{
		Practice e= new Practice("Chandra Sekhar",107);
		e.display();
		
	}
}
