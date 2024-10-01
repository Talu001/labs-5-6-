// file not found exception
public class file {
    public static void main(String[] args) {
        try {
            java.io.File file = new java.io.File("ex.csv");
            java.util.Scanner scanner = new java.util.Scanner(file);            
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error: File not found.");
            System.out.println("Details: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
    }
}
