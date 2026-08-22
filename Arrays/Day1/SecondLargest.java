package Arrays.Day1;


public class SecondLargest {

    static int secondLargest(int[] array) {
        int max = array[0];
        int secondMax = array[0];

        for(int i=1; i<array.length; i++) {
            if(array[i] > max) {
                secondMax = max;
                max = array[i];
                
            }
            else if(array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        return secondMax;


    }
    public static void main(String[] args) {
        int[] arr = {12,3,700,33,440};
        int result = secondLargest(arr);

        System.out.println("Second largest element in the array : "+ result);
    }
    

}
