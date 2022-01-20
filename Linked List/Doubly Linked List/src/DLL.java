public class DLL {

    private Node head;
//    private Node last;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void inserFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val){
        if(head == null) {
            inserFirst(val);
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node node = new Node(val);
        temp.next = node;
        node.prev = temp;
        node.next = null;
        size++;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            inserFirst(val);
        }
        if(index == size - 1) {
            insertLast(val);
        }
        Node node = new Node(val);
        Node temp = head;
        for(int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        node.prev = temp.next.prev;
        temp.next.prev = node;
        temp.next = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
//            last = temp;
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    public void displayrev() {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.print("START");
        System.out.println();
    }



    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
