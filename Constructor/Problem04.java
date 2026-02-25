package practice;
class Problem
{
	int price;
	String brand;
	Practice(String brand)
	{
		this.brand=brand;
	}
	Practice(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
	}
	void display()
	{
		System.out.println("Brand Name : "+brand);
		System.out.println("Car Price  : "+price);
	}
	public static void main(String args[])
	{
		Practice c1= new Practice("BMW");
		Practice c2= new Practice("Porchea",110000000);
		c1.display();
		c2.display();
		
	}
}
