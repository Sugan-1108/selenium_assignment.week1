package assignments.week1.day2;

public class Calculator {

	public int add(int num1, int num2, int num3) 
	{
	
	
		return num1+ num2 +num3;

	}
	
	public int sub(int num1, int num2) 
	{
	
	
		return num1 - num2;

	}
	
	public int mul(int num1, int num2) 
	{
	
	
		return num1 * num2;

	}
	public int div(int num1, int num2) 
	{
	
	
		return num1 / num2;

	}
	
	public static void main(String[] args) 
	{
		Calculator obj1 = new Calculator();
		obj1.add(2,3,4);
		System.out.println("Sum:" +obj1);
	}
}
