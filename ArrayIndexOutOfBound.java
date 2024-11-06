package lab4;

public class ArrayIndexOutOfBound {

    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Tried to access index outside the array.");
            System.out.println("Exception message: " + e.getMessage());
        }

        
    }
}

