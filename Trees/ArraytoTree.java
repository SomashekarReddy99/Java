package Trees;

/**
 * ArraytoTree
 */
public class ArraytoTree extends BST {

    public static void main(String[] args) {
        BST bst=new BST();
        bst.Display();
        int[] nums={1,2,3,4,5,6,7};
        bst.populateSorted(nums);
        System.out.println(bst.balanced());
    }

  
}