import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting value : ");
        int start = sc.nextInt();

        System.out.print("Enter ending value : ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            int original = i;

            //Count number of digits
            int copy = original;
            int digitCount = 0;

            while (copy > 0) {
                copy /= 10;
                digitCount++;
            }

            // Calculate Armstrong sum
            copy = original;
            int sum = 0;

            while (copy > 0) {

                int digit = copy % 10;

                // Calculate digit^digitCount
                int power = 1;

                for (int j = 1; j <= digitCount; j++) {
                    power = power * digit;
                }

                sum = sum + power;

                copy /= 10;
            }

            // Step 3: Check Armstrong number
            if (sum == original) {
                System.out.println("Yes " + i);
            }
        }

        sc.close();
    }
}