import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of working for employs Manual: ");
        int manual = scanner.nextInt();

        System.out.println("Enter the number of working for employs Skilled: ");
        int skilled = scanner.nextInt();

        System.out.println("Enter the number of working for employs Management: ");
        int management = scanner.nextInt();


        int manualWage = manual * 500;
        int skilledWage = skilled * 700;
        int managementWage = management * 800;

        int totalWage = manualWage + skilledWage + managementWage;
        System.out.println("Total wage bil: " + totalWage);

        int tax = totalWage * 20/100;
        System.out.println("Tax pay for the bill: " +  tax);

    }

}

