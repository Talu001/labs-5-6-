// InputMisMatchException

public class mismatch {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);        
        try {
            System.out.print("enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("you entered: " + number);
        } catch (java.util.InputMismatchException e) {
            System.out.println("error: invalid input. please enter an integer.");
        } catch (Exception e) {
            System.out.println("an unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
