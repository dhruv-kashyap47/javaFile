import java.util.*;

public class Test{
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int num = input.nextInt();
       if(num % 2 == 0){
           System.out.print("Its an Even number");
       }
       else{
           System.out.print("Its a ODD number");
       }
       
    }
}