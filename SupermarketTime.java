import java.util.*;

public class SupermarketTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of people in the supermarket: ");
        int numPeople = scanner.nextInt();
        
        int[] itemsList = new int[numPeople];
        int totalTime = 0;
        
        for (int i = 0; i < numPeople; i++) {
            System.out.print("Enter the number of items for person " + (i+1) + ": ");
            itemsList[i] = scanner.nextInt();
        }
        
        int currentIndex = 0;
        int remainingItems = itemsList[currentIndex];
        
        while (remainingItems > 0) {
            int itemsToBuy = Math.min(remainingItems, 6);
            int time = (itemsToBuy < 6) ? 2 : 7;
            
            totalTime += time;
            remainingItems -= itemsToBuy;
            
            currentIndex++;
            if (currentIndex >= numPeople)
                currentIndex = 0;
            
            if (remainingItems > 0 && currentIndex == 0)
                System.out.println("Waiting for next cycle...");
            
            System.out.println("Person " + (currentIndex+1) + " bought " + itemsToBuy + " items. Time: " + time + " mins");
        }
        
        System.out.println("Total time taken by all people: " + totalTime + " mins");
    }
}
