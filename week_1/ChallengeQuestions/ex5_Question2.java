import java.util.Scanner;


public class ex5_Question2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter value in meters: ");
		int meter = scanner.nextInt();

		int centiMeters = meter*100;
		System.out.println("The value in Centimeters: " + centiMeters);

	}
}