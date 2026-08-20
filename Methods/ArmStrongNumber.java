package Methods;

import java.util.Scanner;

public class ArmStrongNumber {
    // In this program we are going to check whether a number is armstrong number or not.
    // we are going to create different methods such as 
    // countDigits => will count no.of digits in a number
    // calculatePower => will calculate powers of each digit
    // isArmstrong => will check whether it is a armstrong number or not.

    static int countDigits(int number) {
        int count = 0;
        while(number > 0) {
            number = number / 10;
            count++;
        }
        return count;

    }

    static int calculatePower(int base , int power) {
       
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * base;
        }

        return result;
    }
    static boolean isArmstrong(int number) {
       int original = number;

        int digitCount = countDigits(number);

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;

            int power = calculatePower(digit, digitCount);

            sum = sum + power;

            number = number / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting value: ");
        int start = sc.nextInt();

        System.out.print("Enter ending value: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {

            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        sc.close();
        
    }
}
