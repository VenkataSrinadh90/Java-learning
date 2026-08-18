import java.util.Scanner;

// Need to print tables.

public class Tables {
    public static void main(String main[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which table you want : ");
        int n = sc.nextInt();

        
            for (int j = 0; j <= 10; j++) {
            System.out.println(n + " x " + j + " = " + (n * j));
        }
        sc.close();
    }
}
