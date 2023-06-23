import java.util.LinkedList;

public class LinkedListMinMax {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(2);
        linkedList.add(15);

        int min = findMin(linkedList);
        int max = findMax(linkedList);

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

    public static int findMin(LinkedList<Integer> linkedList) {
        if (linkedList.isEmpty()) {
            throw new IllegalArgumentException("Linked list is empty.");
        }

        int min = linkedList.get(0);
        for (int i = 1; i < linkedList.size(); i++) {
            int current = linkedList.get(i);
            if (current < min) {
                min = current;
            }
        }
        return min;
    }

    public static int findMax(LinkedList<Integer> linkedList) {
        if (linkedList.isEmpty()) {
            throw new IllegalArgumentException("Linked list is empty.");
        }

        int max = linkedList.get(0);
        for (int i = 1; i < linkedList.size(); i++) {
            int current = linkedList.get(i);
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}
