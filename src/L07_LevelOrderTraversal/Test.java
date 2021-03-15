/**
 *     Print Level Order Traversal
 *                  10
 *              /        \
 *             15        20
 *           /          /  \
 *          30         40  50
 *                    / \
 *                   60  70
 *     
 *        10  15 20  30  40  50  60  70
 * 
 */
package L07_LevelOrderTraversal;
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
    static void levelOrderTraversal(Tree root)
    {
       Queue<Tree> q=new LinkedList<Tree>();
       q.add(root);
       while(!q.isEmpty())
       {
           Tree temp=q.poll();
           System.out.print(temp.data+" ");
           if(temp.left!=null)
           q.add(temp.left);
           if(temp.right!=null)
           q.add(temp.right);
       }
    }
    public static void main(String args[])
    {
       Scanner obj=new Scanner(System.in);
       root=new Tree(10);
       root.left=new Tree(20);
       root.left.left=new Tree(40);
       root.left.right=new Tree(50);
       root.left.right.right=new Tree(70);
       root.left.right.right.left=new Tree(80);
       root.right=new Tree(30);
       root.right.right=new Tree(60);  
       root.right.right.left=new Tree(110);
       levelOrderTraversal(root);
    }
}
