package linked;

public class LL {
  private Node head;
  private Node tail;
  private int size;
  public LL() {
      this.size=0;
      this.head=null;
      this.tail=null;
  }
 public void insertFirst(int value) {
      Node node = new Node(value);
      node.next=head;
      head=node;
      if(tail==null)
      {
          tail=head;
      }
      size+=1;
 }
 public void insertLast(int value){
      if(tail==null){
         insertFirst(value);
      }else {
          Node node = new Node(value);
          tail.next = node;
          tail = node;
      }
          size += 1;
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
     Node temp=head;
     for(int i=1;i<index;i++){
         temp=temp.next;
     }
 Node node=new Node(value);
     node.next=temp.next;
     temp.next=node;
//   Node node=new Node(value,temp.next);
//     temp.next=node;
     size+=1;
 }
    public  int deleteFirst()
    {
        int value=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size-=1;
        return value;
    }

    public int delete(int index){
        if(index==0)
        {
            return   deleteFirst();
        }
        if(index==size-1)
        {
            return   deleteLast();
        }
        Node prev=get(index-1);
       int value=prev.next.value;
        prev.next=prev.next.next;

        size-=1;
        return value;
    }
    public int deleteLast(){
        if(size<=1)
        {
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int value= tail.value;
        tail=secondLast;
        tail.next=null;
        size-=1;
        return value;
    }

    public Node Find(int value)
    {
        Node node=head;
        while(node!=null){
            if(node.value==value)
            {
                return node;
            }
            node=node.next;
        }
        return null;
    }
 public void Display(){
      Node temp=head;
      while(temp!=null){
          System.out.print(temp.value+"->");
          temp=temp.next;
      }
      System.out.println("END");
     System.out.println(size);

 }
//recursion insertion
    public void insertRec(int value,int index)
    {
        head=insertRec(value,index,head);
    }
    private Node insertRec(int value,int index,Node node)
    {
        if(index==0)
        {
            Node temp=new Node(value,node);
            temp.next=node;
            size+=1;
            return temp;
        }
        node.next=insertRec(value,index-1,node.next);
        return node;
    }
  private static class Node{
      private final int value;
      private Node next;
       public Node(int value) {
           this.value = value;
       }
     public  Node(int value, Node next) {
           this.value = value;
           this.next = next;
     }
  }
// questions
    public void deleteDup()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.value==temp.next.value)
            {
                temp.next=temp.next.next;
                size-=1;
            }else {
                temp = temp.next;
            }
        }
        tail=temp;
        tail.next=null;
    }
    // merge two linked list
    public static LL merge(LL first,LL second)
    {
        Node f=first.head;
        Node s=second.head;
        LL ans=new LL();
        while(f!=null && s!=null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
            if(f!=null)
            {
                ans.insertLast(f.value);
                f=f.next;
            }
            if(s!=null)
            {
                ans.insertLast(s.value);
                s=s.next;
            }

        return ans;
    }
    //cycle or not
    public boolean hasCycle(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null )
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                return true;
            }
        }
        return false;
    }
       //find the middle of linked list
    Node getmid(Node head)
    {
        Node f=head;
        Node s=head;
        if(s.next==null)
        {
            System.out.println(head.value);
            return f;
        }
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
//        System.out.println(s.value);
        return f;
    }
    //mergesort using bubble sort
    public void BubbleSort() {
        bubbleSort(size-1,0);
    }
    public  void bubbleSort(int row,int col)
    {
        if(row==0)
        {
            return;
        }
        if(col<row) {
            Node first = get(col);
            Node second = get(col + 1);
            if ( second!=null && first.value > second.value)  {
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }

                else if (second == tail) {
                    Node prev = get(col - 1);
                    tail = first;
                    prev.next = second;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        }
            else{
                bubbleSort(row-1,0);
            }


    }
    public Node get(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }


    // reverse  linklist using recursion
    void ReverseRec(Node node)
    {

        if(node==tail)
        {
            head=tail;
            return;
        }
        ReverseRec(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    // reverse using iterative
     Node reverse(Node head) {
        if (size < 2) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while(present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }

        }
         return  head;
    }
    // reverse list part 2
  private static  Node reverse2(Node head, int left, int right)
    {
        if(left==right)
        {
            return head;
        }
        Node prev=null;
        Node curr=head;
        for(int i=0;curr!=null && i<left-1;i++)
        {
            prev=curr;
            curr=curr.next;
        }
        Node last=prev;
        Node newed=curr;
        // reverse subset

        Node next=curr.next;
        for(int i=0; curr!=null && i<(right-left+1);i++) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }
        if(last!=null)
        {
            last.next=prev;
        }
        else
        {
            head=prev;
        }
        newed.next=curr;
        return head;
    }
    //palindrome or not
    private boolean palindrome(Node head)
    {
        Node middle=getmid(head);
        Node headsecond=reverse(middle);
        Node rereverse=headsecond;
        while(head!=null && headsecond!=null)
        {
            if(head.value !=headsecond.value) {
                break;
            }
            head=head.next;
            headsecond=headsecond.next;
        }
        reverse(rereverse);
        return  head==null || headsecond==null;


    }
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        System.out.println( list.palindrome(list.head));
        list.ReverseRec(list.head);
//        list.reverse2(list.get(0),2,4);
//        list.reverse();
        list.Display();
    }
}


