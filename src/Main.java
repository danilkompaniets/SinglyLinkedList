public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.prepend(1);
        singlyLinkedList.prepend(2);
        singlyLinkedList.prepend(3);
        singlyLinkedList.prepend(4);
        singlyLinkedList.prepend(5);
        singlyLinkedList.prepend(6);
        singlyLinkedList.prepend(7);
        var res = singlyLinkedList.popAt(0);

        singlyLinkedList.printNodes();

        singlyLinkedList.getHead();

    }
}