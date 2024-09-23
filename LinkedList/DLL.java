package LinkedList;
public class DLL{
    Node head;
    Node tail;
    int size=0;
    class Node{
        Node next;
        Node prev;
        int value;
        Node(int value)
        {
            this.value=value;
        }
        Node(int value,Node next,Node prev)
        {
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
    public void insertFirst(int value)
    {
     Node node=new Node(value);
        if(tail==null)
        {
            tail=node;
        }
        if(head!=null)
        {
            head.prev=node;
        }
        node.next=head;
        head=node;
        
    }
    public void insertLast(int value)
    {
        Node node=new Node(value);
        if(tail==null)
        {
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            node.prev=tail;
            node.next=null;
            tail=node;
        }
    }
    public int DeleteFirst()
    {
        if(head==null)
        {
            return -1;
        }
        int v=head.value;
        head=head.next;
        head.prev=null;
        return v;
    }
    public int DeleteLast()
    {
        if(head==null)
        {
            return -1;
        }
        int v=tail.value;
        Node temp=tail.prev;
        temp.next=null;
        tail=temp;
        return v;
    }
    public  void Display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"<->");
            temp=temp.next;
        }
          System.out.println();
    }
    public static void main(String[] args)
    {
        DLL dl=new DLL();
        dl.insertFirst(3);
         dl.insertFirst(2);
          dl.insertFirst(1);
           dl.insertLast(4);
           dl.Display();
           
           System.out.println(dl.DeleteLast());
            dl.insertFirst(3);
         dl.insertFirst(2);
          dl.insertFirst(1);
           dl.insertLast(4);
            dl.Display();
    }
}