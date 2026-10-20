public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Methods will be added here later
    // add()
    // remove()
    // print()
    // search()

    public static void main(String args[]) {

        LinkedList ll = new LinkedList();

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Connecting nodes
        first.next = second;
        second.next = third;

        // Set head and tail
        head = first;
        tail = third;

        // Traversing the linked list
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}