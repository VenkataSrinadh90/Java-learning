package Arrays.Day1;

public class MaxAndMin {
    // Calculates maximum element from the array
    static int maxElement(int[] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) 
                max = arr[i];
        }

        return max;
    }

    // calculates minimum element from the array
    static int minElement(int[] arr) {
        int min = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) 
                min = arr[i];
        }

        return min;
    }

    public static void main(String[] args) {
        // Array Declaration
        int[] array = {25, 10, 45, 1, 89, 32};
        // Function calling
        int maxResult = maxElement(array);
        int minResult = minElement(array);
        
        System.out.println("Maximum Value : "+maxResult);
        System.out.println("Minimum Result : "+minResult);

    }
}
