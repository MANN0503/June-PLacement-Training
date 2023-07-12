import java.util.*;

public class Findmaxandmininanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Smallest element: " + arr[0]);
        System.out.println("Largest element: " + arr[n - 1]);

        sc.close();

    }
}