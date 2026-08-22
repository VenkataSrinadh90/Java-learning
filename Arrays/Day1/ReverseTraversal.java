package Arrays.Day1;

public class ReverseTraversal {
    public static void main(String[] args) {
        

        // Array declaration
        int[] numbers = {10, 20, 30, 40, 50};

        // Traversing through ARRAY and printing numbers in reverse order.

        for(int i=numbers.length-1 ; i>=0; i--) {
            System.out.println(numbers[i]);
        }

    }
}
