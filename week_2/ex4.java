import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);


		System.out.println("Enter your grade: ");
		int grade = input.nextInt();


		if (grade < 25) {
			
			System.out.println("Your grade is F");

		} else if (grade >= 25 && grade < 45) {

			System.out.println("Your grade is E");

		} else if (grade >= 45 && grade < 50) {

			System.out.println("Your grade is D");

		} else if (grade >= 50 && grade < 60) {

			System.out.println("Your grade is C");

		}  else if (grade >= 60 && grade < 80) {

			System.out.println("Your grade is B");

		} else {

			System.out.println("Your grade is A");

		}


	}


}