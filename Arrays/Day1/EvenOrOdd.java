package Arrays.Day1;

public class EvenOrOdd {
    // In this prgram we are going to check total no.of even and odd elements in an array.

    static int[] evenOrOdd(int[] elements) {

        int even = 0;
        int odd = 0;

        for(int element : elements) {
            if(element % 2 == 0)
                even++;
            else
                odd++;
        }
        return new int[]{even,odd};
    }

    public static void main(String[] args) {
        // Array Declaration
        int[] arr = {10, 15, 22, 31, 44, 57};
        
        int[] result = evenOrOdd(arr);
        System.out.println("even : "+ result[0]);
        System.out.println("odd : "+ result[1]);
    }
}
