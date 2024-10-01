// ArrayIndexOutOfBoundsException 
class index {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error: array index out of bounds.");
            System.out.println("details: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("an unexpected error occurred.");
            e.printStackTrace();
        }
    }
}