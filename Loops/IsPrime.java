import java.util.Scanner;
public class IsPrime {
    public static void main(String args[]) {
        boolean isPrime = true;

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        for(int i=2; i<= Math.sqrt(n); i++) {
            if( n % 2 == 0){
                isPrime = false;
            }
        }
        if(isPrime) {
            System.out.println("prime number");
        }
        else {
            System.out.println("Not a Prime");
        }
        sc.close();
    }
    
}
