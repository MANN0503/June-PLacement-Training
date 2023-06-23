import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListNodeIndex {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(15);

        // Get user input for the node value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to find its index in the linked list: ");
        int value = scanner.nextInt();

        int index = findNodeIndex(linkedList, value);

        if (index != -1) {
            System.out.println("Index of node with value " + value + ": " + index);
        } else {
            System.out.println("Node with value " + value + " not found in the linked list.");
        }
    }

    public static int findNodeIndex(LinkedList<Integer> linkedList, int value) {
        for (int i = 0; i < linkedList.size(); i++) {
            int current = linkedList.get(i);
            if (current == value) {
                return i;
            }
        }
        return -1; // Node not found
    }
}
