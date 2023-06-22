import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                evenSum += array[i];
            } else {
                oddSum += array[i];
            }
        }

        System.out.println("Sum of even elements: " + evenSum);
        System.out.println("Sum of odd elements: " + oddSum);
    }
}
