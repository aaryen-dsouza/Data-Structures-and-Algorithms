public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        head = node;
        size++;
    }

    public void headVal() {
        System.out.println(head.val);
    }

    public void tailVal() {
        System.out.println(tail.val);
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if(head == null) {
            node = head;
            node = tail;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void delete(int val) {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (head.val == val) {
            tail.next = temp.next;
            head = temp.next;
            size--;
            return;
        }
        if (tail.val == val) {
            while(temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
            size--;
            return;
        }

        while(temp.next.val != val) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.print("HEAD");
        System.out.println();
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
