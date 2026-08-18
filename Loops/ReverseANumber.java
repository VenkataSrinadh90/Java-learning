import java.util.Scanner;

// Here we need to reverse a number 12345 to 54321.

class ReverseANumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any 3 digit number : ");
        int input = sc.nextInt();
        int result = 0;

       while (input > 0) {
           int digits = input % 10; // Produce remainder.
           result = result * 10 + digits; // Multiply initial value of result with 0 and then adds the obtained remainder
           input = input / 10; // Produces quotient. 
       }
       System.out.println("Reversed number : " + result);
        
        sc.close();
    }
    
}
