package practice;

public class Problem02 {
	int age;
	String name;
	Practice(String name,int age)
	{
		this.age=age;
		this.name =name;
		
	}
	void display()
	{
		System.out.println("The Student Name is : "+this.name);
		System.out.println("The Student Age is : "+this.age);
	}
	public static void main(String[] args) {
	Problem02 p1 = new Problem02("Deepak",19);
	Problem02 p2 = new Problem02("Chandra Sekhar",65);
	p1.display();
	p2.display();
	
		
	}

}
