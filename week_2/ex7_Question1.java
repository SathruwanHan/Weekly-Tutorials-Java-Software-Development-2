import java.util.Scanner;
// Program B
public class ex7_Question1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int x = S.nextInt();
        if (x > 0) {
            System.out.println("The value is positive:");
        }if (x < 0) {
            System.out.println("The value is negative:");
        } else {
            System.out.println("The value is zero:");
        }
        System.out.println("Good Bye!");

    }

}

// Program A and C are similar due to the error in program B
// If you enter value 5 it will go through the first if condition and print its statement
// It will go through the second if statement and will trigger the else condition since 5 is not below 0
// Therefore two statements will be printed