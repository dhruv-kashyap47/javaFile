import java.util.Scanner;

public class Test2 {

    // Function jo nth Fibonacci number nikalega
    public static int findNthFibonacci(int n) {
        
        // Step 1: Base cases ko handle karna
        // Agar n = 0 ya n = 1 hai, toh result n hi hoga
        if (n <= 1) {
            return n;
        }

        // Step 2: Shuruaati variables banana
        int a = 0; // Pichla se pichla number (F_n-2)
        int b = 1; // Pichla number (F_n-1)
        int c;     // Current number (F_n)

        // Step 3: Loop chalana
        // Loop 2 se shuru hoga kyunki 0 aur 1 ke cases upar handle ho chuke hain.
        for (int i = 2; i <= n; i++) {
            
            // Step 4: Agla Fibonacci number calculate karna
            c = a + b;
            
            // Step 5: Values ko update karna (aage badhana)
            a = b;
            b = c;
        }
        
        // Step 6: Final result return karna
        // Loop ke अंत mein 'b' mein nth Fibonacci number hoga
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