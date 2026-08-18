import java.util.Scanner;
// We should count the number of digits in n and should return their total sum.
public class CountDigitsAndSumThem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int input = sc.nextInt();
        int count = 0;
        int result = 0;

        while(input > 0) {
            int digits = input % 10;
            result = result + digits;
            input /= 10;
            count++;
        }
        System.out.println("Total count = " + count);
        System.out.println("Total sum = " + result);

        sc.close();
    }
}
