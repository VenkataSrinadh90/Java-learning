import java.util.Scanner;
// Need to print total odd and even number between 1 to n
class EvenOrOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n to print odd and even number between 1 to n:");
        int n= sc.nextInt();
        int even = 0;
        int odd = 0;

        for(int i=0; i<n; i++) {
            if(i % 2 == 0) 
                even++;
            else 
                odd++;
        }
        System.out.println("Even : " + even);
        System.out.println("Odd : "+ odd);
        sc.close();
    }
}
