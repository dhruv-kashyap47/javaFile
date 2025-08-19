import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = input.next().charAt(0);

        if (operation == '+') {
            System.out.println("Addition: " + (first + second));
        }
        else if (operation == '-') {
            System.out.println("Subtraction: " + (first - second));
        }
        else if (operation == '*') {
            System.out.println("Multiplication: " + (first * second));
        }
        else if (operation == '/') {
            if (second == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                System.out.println("Division: " + (first / second));
            }
        }
        else {
            System.out.println("Invalid operation entered.");
        }
        
        input.close();
    }
}