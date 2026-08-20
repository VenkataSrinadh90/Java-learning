package Methods;

public class EvenOrOdd {
    // In this method we are going to check whether a number is even or odd. 
    // We are going to create a method called isEven().

    static boolean isEven(int x){
        if( x%2 == 0) 
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        boolean result = isEven(789);
        System.out.println(result);
}
}
