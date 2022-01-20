public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
        list.headVal();
        list.tailVal();
        list.delete(4);
        list.display();
    }
}
