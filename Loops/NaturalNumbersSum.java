import java.util.Scanner;

class NaturalNumbersSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n to calculate the sum: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Result = " + sum);
        sc.close();
    }
}
