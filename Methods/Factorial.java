package Methods;

public class Factorial {
    // In this program we are going to calculate the factorial of given number.

    static int fact(int n) {
        if(n == 0)
            return 1;
        else
            return n * fact(n-1);
    }

    public static void main(String[] args) {
        int result = fact(12);
        System.out.println("result : "+ result);
    }
}
