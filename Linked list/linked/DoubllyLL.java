package linked;

public class DoubllyLL {
    Node head;
    int size;
    public DoubllyLL() {
        head = null;
        size = 0;
    }


    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head!= null) {
            head.prev = node;
        }
        head = node;
        size += 1;
    }

    public void insertLast(int value) {

        Node node = new Node(value);
        node.next=null;
        if(head == null) {
            head=node;
            node.prev=null;
            return;
        }
        Node last=head;

        while(last.next!=null)
        {
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        size += 1;
    }
    public void insert(int value,int index)
    {
      if(index==0)
        {
         insertFirst(value);
          return;

          }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value);
        node.next=temp.next;
        node.prev=temp;

        temp.next=node;
       size += 1;
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
//        System.out.println("print in reverse");
//        while (last != null) {
//            System.out.print(last.value + "<->");
//            last = last.prev;
//        }
//        System.out.println("START");
    }
    public void insertaftervalue(int aftervalue, int data)
    {
        Node temp=Find(aftervalue);
        if(temp==null)
        {
            System.out.println("not found value");
            return;
        }
        Node node=new Node(data,temp.next,temp);
        temp.next=node;
        size += 1;
    }
public Node Find(int value) {
        Node temp=head;
       while(temp!=null)
       {
           if(temp.value==value)
           {
               return temp;
           }
           temp=temp.next;
       }
       return null;
}
public int deleteFirst()
{
    if(head==null)
    {
        return -1;
    }
    int value=head.value;
    head=head.next;
    size--;
   return value;
}
    public void deleteLast()
    {
        if (head == null) {
            return ;
        }
     Node temp=get(size-2);
        temp.next=null;
    }
    public Node get(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
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