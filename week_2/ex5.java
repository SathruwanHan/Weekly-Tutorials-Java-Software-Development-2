import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a month: ");
		String month = input.nextLine();

		String lowerMonth = month.toLowerCase();

		switch (month) {
			case "january":
				System.out.println("There are 31 days");
				break;
			case "february":
				System.out.println("There are 28 days");
				break;
			case "march":
				System.out.println("There are 31 days");
				break;
			case "april":
				System.out.println("There are 30 days");
				break;
			case "may":
				System.out.println("There are 31 days");
				break;
			case "june":
				System.out.println("There are 30 days");
				break;
			case "july":
				System.out.println("There are 31 days");
				break;
			case "august":
				System.out.println("There are 31 days");
				break;
			case "september":
				System.out.println("There are 30 days");
				break;
			case "october":
				System.out.println("There are 31 days");
				break;
			case "november":
				System.out.println("There are 30 days");
				break;
			case "december":
				System.out.println("There are 31 days");
				break;

		}

	}

}