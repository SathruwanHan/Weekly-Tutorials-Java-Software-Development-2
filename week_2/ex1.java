import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number 1: ");
		double num1 = input.nextDouble();

		System.out.println("Please enter number 2: ");
		double num2 = input.nextDouble();

		double total = num1 + num2;
		System.out.println("Total of two numbers are: " + String.format("%.2f",total));
			
	}


}