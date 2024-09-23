package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BST{
    Node root;
    public class Node{
        int value;
        int height;
        Node left;
        Node right;
        Node(int value)
        {
            this.value=value;
            this.height=0;
        }
        public int getValue()
        {
            return value;
        }
    }
     public BST() {
         root=null;
        }
    public int height(Node node)
    {
        if(node==null)
        {
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty()
    {
        return root==null;
    }
    public void insert(int value)
    {
        root=insert(value,root);
    }
    public Node insert(int value,Node node)
    {
        if(node==null)
        {
            node=new Node(value);
            return node;
        }
        if(value<node.value)
        {
           node.left=insert(value,node.left);
        }
        if(value>node.value)
        {
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }
    public void preOrder()
    {
       preOrder(root);
        System.out.println();
    }
    public void preOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.print(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
  
    }
     public void inOrder()
    {
       inOrder(root);
        System.out.println();
    }
    public void inOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
        
    }
      public void postOrder()
    {
       postOrder(root);
        System.out.println();
    }
    public void postOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
         System.out.print(node.value+" ");
        
    }
      public void bfs()
    {
        bfs(root);
    }
    public void bfs(Node node)
    {
        if(node==null)
        {
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            Node current=queue.poll();
            System.out.print(current.value+" ");
         if(current.left!=null)
         {
             queue.add(current.left);
         }
          if(current.right!=null)
         {
             queue.add(current.right);
         }
        }
    }
    public void Display()
    {
        display(root,"Root Node");
    }
    public void display(Node node,String details)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(details+node.getValue());
    display(node.left,"left child is of"+node.getValue()+":");
    display(node.right,"right child is of"+node.getValue()+":");
    }
     public boolean balanced()
   {
       return balanced(root);
   }
   public boolean balanced(Node node)
   {
       if(node==null)
       {
           return true;
       }
       return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
   }
//    public void populate(int[] nums)
//    {
//        for(int i=0;i<nums.length;i++)
//        {
//            this.insert(nums[i]);
//        }
//    }
   public void populateSorted(int[] nums)
   {
       populateSorted(nums,0,nums.length);
   }
   public void populateSorted(int[] nums,int start,int end)
   {
       if(start>=end)
       {
           return;
       }
           int mid=(start+end)/2;
           this.insert(nums[mid]);
           populateSorted(nums,0,mid);
           populateSorted(nums,mid+1,end);
   
   }
    public static void main(String[] args)
    {
    //     BST bst=new BST();
    //     bst.insert(5);
    //     bst.insert(3);
    //     bst.insert(6);
    //     bst.Display();
    //     bst.preOrder();
    //     bst.inOrder();
    //     bst.postOrder();
    //    System.out.println(bst.balanced());
       BST bst=new BST();

       int[] nums={1,2,3,4,5,6,7};
       bst.populateSorted(nums);
       bst.Display();
    }
   
}

