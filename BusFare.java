import java.util.Scanner;

public class BusFare() {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of stops: ");
        int stops = scanner.nextInt();
        
        int[] distance = new int[stops - 1];
        for(int i = 0; i < stops - 1; i++) {
            System.out.println("Distance travelled between stop " (i + 1) "and" (i + 2) " is: ");
            distance[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the starting point: ");
        int start = scanner.nextInt();
        
        System.out.println("Enter the ending point: ");
        int end = scanner.nextInt();
        
        int totalfare = int busfare(distance, start, end);
        System.out.println("Total fare: " + totalfare);
        
        scanner.close();
    }
    
    private static int busfare(int[] distance, int start, int end) {
        int totaldistancetravelled = 0;
        
        for(int i = start - 1, i <= end; i++) {
            totaldistancetravelled += distance[i];
        }
        
        int fare = totaldistancetravelled * 5;
        
        if(fare <= 20){
            System.out.println(20);
        } else {
            System.out.println(fare);
        }
        
        int roundedFare = (int) Math.ceil(fare / 20.0) * 20;

        return roundedFare;
    }
}