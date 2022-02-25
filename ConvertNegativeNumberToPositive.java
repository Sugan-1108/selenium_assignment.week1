package assignments.week1.day2;

public class ConvertNegativeNumberToPositive {

	public static void main(String[] args) {
		int number = -40;
		
		if (number<0)
		{
			int convert = number * (-1) ;
		    System.out.println("The Given Number" +number+ "is converted to" +convert );
		}
		
		else
			System.out.println("The Given Number is Positive");

	}

}
