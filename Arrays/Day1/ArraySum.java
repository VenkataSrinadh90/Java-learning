package Arrays.Day1;

public class ArraySum {

    static int arraySum(int[] elements) {

        int sum = 0;
        
        for(int number: elements) {
            sum = sum + number;
        }
        return sum;
    }

   public static void main(String[] args) {
    // Declaring array
    int[] numbers = {10, 20, 30, 40, 50,100};

    // calling arraySUm method
     int result = arraySum(numbers);
     System.out.println(result);
   }
}
