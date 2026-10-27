import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int x = scan.nextInt();
            System.out.println("You entered: " + x);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scan.close();
    }
} 
