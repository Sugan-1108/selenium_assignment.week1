package assignments.week1.day2;

public class SumOfDigits {

	public static void main(String[] args) 
	{
	
		int input = 789;
		int sum = 0 ;
		
		while(input>0)
		{
		int rem = input % 10;
		sum = rem + sum;
		input = input / 10;
		
		}
		
		System.out.println("The sum of the digits of given number is" +sum);
			

	}

}
