
import java.util.Scanner;

public class CalculatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator overload = new Calculator();			
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers are in your list?");	
		int num = input.nextInt();
		
		int array []  = new int [num];
		
		System.out.println("Please enter positive integers now.");
		
		for (int i = 0; i < array.length; i++) {		
			array[i] = input.nextInt();
		}
	
	System.out.println(Calculator.getSum(array));
	System.out.println(Calculator.getAvg(array));
	System.out.println(Calculator.getProd(array));
	System.out.println(Calculator.getFact(array));
		
	}
		
}
