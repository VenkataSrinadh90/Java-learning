package Methods;

public class GCD {
    // In this program we are going to calculate gcd of 2 numbers using euclidean algorithm


    static int findLCM(int x, int y) {
        //findGCD(x, y);
        return (x * y) / findGCD(x, y);
    }
    static int findGCD(int a, int b) {
        int gcd  = 0;
         while(b > 0) {
            gcd = a % b;
            a = b;
            b = gcd;
         }
         return a;
    }

    public static void main(String[] args) {
        int finalOp = findLCM(48, 18);
        System.out.println(finalOp);
    }
}
