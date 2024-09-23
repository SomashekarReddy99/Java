package LinkedList;


class LinkList{
    Node head;
    int size=0;
    class Node{
        int value;
        Node next;
        Node(int value)
        {
            this.value=value;
        }
        Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
    public void insertLast(int value)
    {
        Node node=new Node(value);
        if(head==null)
        {
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
            node.next=null;
        }
        size++;
    }
      public void insertFirst(int value)
    {
        Node node=new Node(value);
        if(head==null)
        {
            head=node;
        }
        else{
          node.next=head;
          head=node;
        }
        size++;
    }
    public void insert(int value,int index)
    {
        if(index==0)
        {
            insertFirst(value);
            return;
        }
        if(index==size)
        {
            insertLast(value);
            return;
        }
          Node node=new Node(value);
          Node temp=getNode(index);
          node.next=temp.next;
          temp.next=node;
          size++;
    }
    public Node getNode(int index)
    {
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
  public int deleteFirst()
  {
      if(head==null)
      {
          return -1;
      }
          int v=head.value;
          head=head.next;
         size--;
      return v;
  }
  public int deleteLast()
{
    Node temp=getNode(size-1);
    int v=temp.next.value;
    temp.next=null;
    size--;
    return v;
}
public int delete(int index)
{
    if(index==0)
    {
        return deleteFirst();
    }
    if(index==size)
    {
        return deleteLast();
    }
    Node temp=getNode(index);
    int v=temp.next.value;
    temp.next=temp.next.next;
    return v;
}
    public void Display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        LinkList list=new LinkList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertFirst(0);
        list.insert(99,4);
         list.Display();
        System.out.println(list.delete(0));
        list.Display();
    }
}