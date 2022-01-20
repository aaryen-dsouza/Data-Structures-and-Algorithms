public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.inserFirst(3);
        list.inserFirst(4);
        list.inserFirst(5);
        list.display();
        list.displayrev();
        list.insertLast(2);
        list.display();
        list.insert(6, 2);
        list.display();
    }
}
