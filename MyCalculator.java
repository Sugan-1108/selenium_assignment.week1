package assignments.week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		
		int add = obj.add(2,3,4);
		System.out.println("Sum:" +add);
	
		int sub = obj.sub(4,2);
		System.out.println("Sub:" +sub);
		
		int mul = obj.mul(4,2);
		System.out.println("Mul:" +mul);
		
		int div = obj.div(4,2);
		System.out.println("Div:" +div);
		
	}

}
