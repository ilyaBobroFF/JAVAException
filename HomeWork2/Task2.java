package HomeWork2;

public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 8;
            int[] intArray = {5, 69, 14, 78, 79, 14, 76, 39, 47};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
}
