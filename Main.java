import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int addSecondLargest(int[] arr) {
        int[] evenArr = new int[(arr.length + 1) / 2];
        int[] oddArr = new int[arr.length / 2];

        // Separating even and odd index elements
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenArr[i / 2] = arr[i];
            } else {
                oddArr[i / 2] = arr[i];
            }
        }

        Arrays.sort(evenArr);
        Arrays.sort(oddArr);

        // Checking if there is a second largest element in evenArr
        int evenMax2 = evenArr.length >= 2 ? evenArr[evenArr.length - 2] : Integer.MIN_VALUE;
        // Checking if there is a second largest element in oddArr
        int oddMax2 = oddArr.length >= 2 ? oddArr[oddArr.length - 2] : Integer.MIN_VALUE;

        return evenMax2 + oddMax2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = addSecondLargest(arr);
        System.out.println("The sum of the second-largest elements from even and odd index positions is: " + result);
    }
}
