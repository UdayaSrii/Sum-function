import java.util.Scanner;
public class SumFunction {
    // The function to be used in the summation
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    // The main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // The start and end of the range
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        // The summation
        int result = sum(number1, number2);
        // Print the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }
}

