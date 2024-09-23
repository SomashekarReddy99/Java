package linked;

public class CSL {
    Node head;
    Node tail;
    int size;
    public CSL() {
        head=null;
        tail=null;
        size=0;
    }
    public void insertFirst(int value)
    {
        Node node=new Node(value);
        if(head==null)
        {
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void Display()
    {
        Node temp=head;
        if(temp==null)
        {
            return;
        }
        if(head==tail){
            System.out.print(head.value);
            return;
        }
        do
        {
            System.out.print(temp.value+"<->");
            temp=temp.next;

        }while(temp!=head);
        System.out.print(head.value);
        System.out.println();

    }
    public void delete(int value)
    {
        Node temp=head;
        if(temp==null)
        {
            return;
        }
        if(temp.value==value)
        {
           head=head.next;
            tail.next=head;
            size--;
            return;
        }
        while (temp.next != head) {
            if (temp.next.value == value) {
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                size--;
                return;
            }
            temp = temp.next;
        }
        size--;

    }
    public static class Node{
        Node next;
        int value;
        public Node(int value)
        {
            this.value=value;
        }
        public Node(int value,Node next){
        this.value=value;
        this.next=next;
        }
    }
}
