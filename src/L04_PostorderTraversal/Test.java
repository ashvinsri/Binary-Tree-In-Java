/**
 *                   Tree Traversal    (Accessing each node exactly once)
 *                 /                \
 *         Breadth First         Depth First
 *  (Level Order Traversal)          |-> Inorder Traversal(Left Subtree--> Node --> Right Subtree) (LNR) 
 *                                   |-> Preorder Traversal(Node --> Left Subtree-->Right Subtree) (NLR)
 *                                   |-> Postorder Traversal(Left Subtree--> Right Subtree-->Node) (LRN)  
 * 
 */
package L04_PostorderTraversal;
import java.util.*;
/**
 *
 * @author Ashvin Srivastava
 */

class Tree
    {
        int data;
        Tree left;
        Tree right;
        Tree(int d)
        {
            this.data=d;
            left=null;
            right=null;
        }
    }
public class Test {
    static Tree root=null;
    static void postorder(Tree root)
    {
        if(root!=null)
        {
            postorder(root.left);         // Access Left Subtree
            postorder(root.right);        // Access Right Subtree
            System.out.print(root.data+" "); // Access Node
        }
    }
    public static void main(String args[])
    {
       root=new Tree(10);
       root.left=new Tree(20);
       root.left.left=new Tree(40);
       root.left.right=new Tree(50);
       root.right=new Tree(30);
       root.right.right=new Tree(60);   
       
       postorder(root);
    }
}