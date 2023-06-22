public class Node {
    public int value;
    public int priority;
    public Node next;

    public Node(int value, int priority) {
        this.value = value;
        this.priority = priority;
        this.next = null;
    }
}

public class PriorityQueueLinkedList {
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int value, int priority) {
        Node newNode = new Node(value, priority);

        if (isEmpty() || priority < head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && priority >= current.next.priority) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Priority queue is empty.");
        }

        int value = head.value;
        head = head.next;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Priority queue is empty.");
        }

        return head.value;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Priority queue is empty.");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println("Value: " + current.value + ", Priority: " + current.priority);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        PriorityQueueLinkedList queue = new PriorityQueueLinkedList();

        // Enqueue elements with their priorities
        queue.enqueue("Task 1", 2);
        queue.enqueue("Task 2", 1);
        queue.enqueue("Task 3", 3);
        queue.enqueue("Task 4", 1);

        // Display the elements in the queue
        queue.display();
        // Output:
        // Value: Task 2, Priority: 1
        // Value: Task 4, Priority: 1
        // Value: Task 1, Priority: 2
        // Value: Task 3, Priority: 3

        // Dequeue an element
        int task = queue.dequeue();
        System.out.println("Dequeued Task: " + task);
        // Output: Dequeued Task: Task 2

        // Peek the element with the highest priority
        int topTask = queue.peek();
        System.out.println("Top Task: " + topTask);
        // Output: Top Task: Task 4
    }
}
