import java.util.Scanner;


public class ex5_Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value in Centigrade: ");
        double centigrade = scanner.nextInt();

        double fahrenheit = ((9.0/5) * centigrade + 32);
        System.out.println("Value in fahrenheit is: "+ fahrenheit);
    }
}