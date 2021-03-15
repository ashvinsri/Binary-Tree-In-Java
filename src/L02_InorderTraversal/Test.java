/**
 *                   Tree Traversal    (Accessing each node exactly once)
 *                 /                \
 *         Breadth First         Depth First
 *  (Level Order Traversal)          |-> Inorder Traversal(Left Subtree--> Node --> Right Subtree) (LNR) 
 *                                   |-> Preorder Traversal(Node --> Left Subtree-->Right Subtree) (NLR)
 *                                   |-> Postorder Traversal(Left Subtree--> Right Subtree-->Node) (LRN)  
 * 
 */
package L02_InorderTraversal;
import java.util.*;
/**
 *
 * @author DELL-PC
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
    static void inorder(Tree root)
    {
        if(root!=null)
        {
            inorder(root.left);                    //Accesing Left Subtree
            System.out.print(root.data+" ");      //Print the data
            inorder(root.right);                  //Accessing Right Subtree
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
       
       inorder(root);
    }
}