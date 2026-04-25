package practice;

public class Problem01 {
	int age;
	String name;
	Problem01(String name,int age)
	{
		this.age=age;
		this.name =name;
		System.out.println("The Student Name is : "+this.name);
		System.out.println("The Student Age is : "+this.age);
	}
	public static void main(String[] args) {
	Problem01 p1 = new Problem01("Deepak",19);
	Problem01 p2 = new Problem01("Chandra Sekhar",65);
	
		
	}

}
