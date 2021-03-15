/**
 *     Print Level Order Traversal in new line
 *                  10
 *              /        \
 *             15        20
 *           /          /  \
 *          30         40  50
 *                    / \
 *                   60  70
 *     O/P-
 *          10
 *          15  20
 *          30  40  50
 *          60  70
 *
 * 
 */
package L09_LevelOrderTraversalInLine;
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
       q.add(null);
       while(q.size()>1)                           // Main twist is here as queue will never be empty as it will always push one null at last.. so condition will be if only one element is left then break
       {
           Tree temp=q.peek();
           q.poll();
           if(temp==null)                      // If temp==null means we have crossed one level so again add null for next level
           {
               System.out.println();
               q.add(null);
               continue;
           }
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
