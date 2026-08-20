package Methods;

public class Addition {
    // This is a method which contains both parameters as well as return type.
    // In this we are going to create a method called add() with int rturn type.

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        int result = add(1000, 2309);
        System.out.println("Additin result : " + result);
    }
}
