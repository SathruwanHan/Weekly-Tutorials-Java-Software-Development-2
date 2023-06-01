import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int age = input.nextInt();

		if (age >= 18) {

			System.out.println("Age is over 18");
		
		} else if (0 < age && age < 18) {
		

			System.out.println("Age is under 18");

		} else {


			System.out.println("Incorrect age");

		}

	}

}