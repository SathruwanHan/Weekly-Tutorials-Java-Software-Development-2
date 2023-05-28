import java.util.Scanner;


public class ex5_Question1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Whats your first name");
		String firstName = scanner.nextLine();

		System.out.println("Whats your last name");
		String lastName = scanner.nextLine();
		
		System.out.println(firstName.substring(0,1) + lastName.substring(0,1));
		

	}
}