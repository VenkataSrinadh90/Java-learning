package Arrays.Day1;

public class Searcing {
    
    static int search(int[] array, int target) {

        int idx = -1;

        for(int i=0; i<array.length; i++) {
            if(array[i] == target) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int target = 50;
        int result = search(arr, target);
         System.out.println(result);
    }
}
