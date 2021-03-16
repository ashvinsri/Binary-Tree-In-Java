/**
 *  
 *     Children Sum Property
 *              20
 *         /        \
 *        12        8
 *      /   \
 *     8    4
 *    
 *       return true as the sum of leaves is equal to parent like (12=8+4) and (20= 12+8)  hence true
 */
package LA03_ChildrenSumProperty;
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
    static boolean childrenSumProperty(Tree node)
    {
        if(node==null)
            return true;
        if(node.left==null && node.right==null)
            return true;
        int sum=0;
        if(node.left!=null)
        {
            sum=sum+node.left.data;
        }
        if(node.right!=null)
        {
            sum=sum+node.right.data;
        }
        return (sum==node.data && childrenSumProperty(node.left) && childrenSumProperty(node.right));
    }
     public static void main(String args[])
    {
       Scanner obj=new Scanner(System.in);
       root=new Tree(20);
       root.left=new Tree(12);
       root.right=new Tree(8);
       root.left.left=new Tree(8);
       root.left.right=new Tree(4);
//       root.left.right.right.left=new Tree(80);
//       root.right=new Tree(30);
//       root.right.right=new Tree(60);  
//       root.right.right.left=new Tree(110);
       System.out.println(childrenSumProperty(root));
    }
}
