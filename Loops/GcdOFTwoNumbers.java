import java.util.Scanner;
public class GcdOFTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int input1 = sc.nextInt();
        System.out.print("Enter second number = ");
        int input2 =sc.nextInt();
        

        while(input2 > 0) {
           int  remainder = input1 % input2;
            input1 = input2;    
            input2 = remainder;
            
        }
        System.out.println(input1);
        
        sc.close();
    }
    
}
