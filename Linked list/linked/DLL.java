package linked;

public class DLL {
    Node head;
    Node tail;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;

        }
        if (tail == null) {
            tail = head;
        }
        head = node;
    }

    public void insertLast(int value) {

        Node node = new Node(value);
        if (tail == null) {
            head=node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            node.next = null;
            tail = node;
        }
    }

    public void Display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + "<->");
            last = temp;
            temp = temp.next;

        }
        System.out.println("END");
        System.out.println("print in reverse");
        while (last != null) {
            System.out.print(last.value + "<->");
            last = last.prev;
        }
        System.out.println("START");
    }


    public static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

