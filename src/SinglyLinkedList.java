public class SinglyLinkedList {
    private Node head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
    }

    public int getSize() {
        return size;
    }

    public void getHead() {
        if (head != null) {
            System.out.println("---- HEAD ---- data: "+head.getData() + " next: " + head.getNext().getData());
        } else {
            System.out.println("head is null");
        }
    }

    public void prepend(Object data) {
        Node header = new Node(data, null);

        header.setNext(this.head);

        this.head = header;

        this.size++;
    }

    public void printNodes() {
        Node current = head;
        while (current != null) {
            if (current.getNext() == null) {
                System.out.println("data: "+current.getData() + " next: " + "null");
            } else {
                System.out.println("data: "+current.getData() + " next: " + current.getNext().getData());
            }

            current = current.getNext();
        }
    }

    public Node popFirst() {
        if (this.head != null) {
            Node temp = this.head;

            this.head = temp.getNext();
            this.size --;
            return temp;
        }
        else {
            return new Node(null, null);
        }
    }

    public Node popAt(int index) {
        if (index <= size && index >= 0) {
            Node header = new Node(null, this.head);
            Node before = header;

            for (int i = 0; i < index; ++i) {
                before = before.getNext();
            }

            Node temp;
            temp = before.getNext();

            before.setNext(temp.getNext());

            temp.setNext(null);

            this.head = header.getNext();

            this.size--;
            return temp;
        } else {
            return new Node(null, null);
        }
    }

    public void insertAt(Object data, int idx) {
        if (idx >= 0 && idx <= size) {

            Node header = new Node(null, this.head);

            Node current = header;
            for (int i = 0; i < idx; ++i) {
                current = current.getNext();
            }

            Node newNode = new Node(data, current.getNext());

            current.setNext(newNode);

            this.size++;
            this.head = header.getNext();
        }
    }

}
