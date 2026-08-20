package Methods;

public class PrimeNumber {
    // In this program we are going to check whether a number is prime or not using ( i*i <= n ) formula

    static boolean isPrime(int number) {
        if(number < 2)
            return false;

        for(int i=2; i*i <= number; i++) {
            if( number % i == 0) 
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = isPrime(29);
        System.out.println(result);
    }
}
