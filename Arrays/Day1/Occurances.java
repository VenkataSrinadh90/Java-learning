package Arrays.Day1;
import java.util.Scanner;

public class Occurances {
     static int elementOccurance(int[] array, int target) {
        int count = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] == target)
                count++;
        }
        return count;
     }




    public static void main(String[] args) {
        int[] arr = {2,3,4,2,2,6};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target element : ");
        int target = sc.nextInt();

        int result = elementOccurance(arr, target);
        System.out.println("Target element "+target +" is found "+result + " times");

        sc.close();
    }
}
