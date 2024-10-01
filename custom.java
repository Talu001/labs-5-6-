// NegativeNumberException
import java.util.Scanner;
public class custom {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("enter a number: ");
            int number = scanner.nextInt();
            if (number < 0) {
                throw new IllegalArgumentException("negative number entered: " + number);
            }
            System.out.println("u entered: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("an error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}