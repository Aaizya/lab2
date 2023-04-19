public class MyLinkedList<E> {
    private class Node {
        E element;
        Node next;
        Node previous;

        public Node(E element, Node previous, Node next) {
            this.element = element;
            this.previous = previous;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean add(E element) {
        Node newNode = new Node(element, null, tail);
        if (size == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
        return true;
    }

    public E get(int index) {
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.previous;
            }
        }

        return current.element;
    }
    public E remove(int index){
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.previous;
            }
        }

        if (current == head) {
            head = current.next;
        } else {
            current.previous.next = current.next;
        }

        if (current == tail) {
            tail = current.previous;
        } else {
            current.next.previous = current.previous;
        }

        size--;
        return current.element;
    }
    public int size() {
        return size;
    }

}