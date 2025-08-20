import java.util.Scanner;

public class FibonacciFinder {

    public static int findNthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int c;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n) to find the nth Fibonacci number: ");
        int number = scanner.nextInt();

        int result = findNthFibonacci(number);
        System.out.println("The " + number + "th Fibonacci number is: " + result);
        
        scanner.close();
    }
}