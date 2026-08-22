package Arrays.Day1;

public class ArraySorted {
    // In this program we are going to check whether an array is sorted or not.

    static int isSorted(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            if(array[i]>array[i+1]){
                return -1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,7,10};
        int result = isSorted(arr);
        if(result == -1) {
            System.out.println("array is not sorted!");
        }
        else
            System.out.println("Array is sorted!");
    }
}
