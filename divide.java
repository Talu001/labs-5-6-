// Divide by zero 
import java.util.Scanner;
class divide{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.print("num1: ");
            int num1 = s.nextInt();
            System.out.print("num2: ");
            int num2 = s.nextInt();
            System.out.println("ans : " + num1/num2 );
        }
        catch (ArithmeticException e){
            System.out.println("zero division error");
        }
    }
}