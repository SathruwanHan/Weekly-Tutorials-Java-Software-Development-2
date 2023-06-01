import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a character");
		char letter = input.nextLine().charAt(0); //recieving the char through scanner

		if (Character.isLowerCase(letter)) {    //Checking if the letter is lowercase

			System.out.println("Entered letter is lowercase");

		} else {
			
			System.out.println("Entered letter is uppercase");

		}

	}

}