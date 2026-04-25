package practice;
class Problem04
{
	int price;
	String brand;
	Problem04(String brand)
	{
		this.brand=brand;
	}
	Problem04(String brand,int price)
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
		Problem04 c1= new Problem04("BMW");
		Problem04 c2= new Problem04("Porchea",110000000);
		c1.display();
		c2.display();
		
	}
}
