import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteAlternateNodes() {
        if (head == null || head.next == null)
            return;

        Node current = head;
        while (current != null && current.next != null) {
            current.next = current.next.next;
            current = current.next;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class deleteAlternateNodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            linkedList.insert(element);
        }

        System.out.println("Original linked list:");
        linkedList.display();

        linkedList.deleteAlternateNodes();

        System.out.println("Linked list after deleting alternate nodes:");
        linkedList.display();
    }
}
