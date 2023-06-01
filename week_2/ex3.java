import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		System.out.println("Enter the temperature in celcius: ");
		double temp = input.nextDouble();

		if (temp < 38){
			
			System.out.println("Hot");

		} else {

			System.out.println("Cold");


		}

	}


}