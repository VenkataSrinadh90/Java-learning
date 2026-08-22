package Arrays.Day1;


public class ArrayAvg {
    static double avgValue(int[] arr) {
        double avg = 0;
        double sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }
    public static void main(String[] args) {
        int[] array = {12, 7, 3, 77, 95};
        double result = avgValue(array);
        System.out.println("Average of array elements is : "+ result);
    }
}
