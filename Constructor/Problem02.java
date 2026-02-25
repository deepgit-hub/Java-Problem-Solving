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
	Practice p1 = new Practice("Deepak",19);
	Practice p2 = new Practice("Chandra Sekhar",65);
	p1.display();
	p2.display();
	
		
	}

}
