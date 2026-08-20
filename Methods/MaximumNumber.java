package Methods;

public class MaximumNumber {
    // In this program we are going to findout the maximum number among 3 numbers.

    static int maxNumber(int a ,int b, int c) {
        if( a > b && a > c) 
            return a;
        else if(b > c) 
            return b;
        else
            return c;
    }

    public static void main(String args[]) {
        int max = maxNumber(-12,-67,-990);
        System.out.println("MAximum Number is : " + max);
    }
}
