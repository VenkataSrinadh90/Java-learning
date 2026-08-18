import java.util.Scanner;

// We need to print star pattern.
// *
// **
// ***

public class StarPattern {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the star : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) { 
            System.out.print("*");
         }
         System.out.println();
        }
        sc.close();
    }
    
}
