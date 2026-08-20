package Methods;

public class Numbers {
    // This is a method which contains a parameter but no return type.

    static void printNumbers(int n) {
        for(int i=1; i<=n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        printNumbers(5);
    }
}
