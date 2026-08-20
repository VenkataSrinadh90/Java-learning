package Methods;

public class ReverseNumber {
    // In this program we are going to reverse the given number.
    
    static int reverseNumber(int n) {
        int rev = 0;
        while( n > 0) {
        int digit = n % 10;
        rev = rev * 10 + digit;
        n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int number = 1234534;
        int reversed = reverseNumber(number);
        System.out.println("reversed : "+ reversed);
    }
}
