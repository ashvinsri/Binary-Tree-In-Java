/**
 *     Check if Binary Tree is Balanced Or Not
 *                       20
 *                  /           \
 *                 30           40
 *                /  \         /  \
 *               50  60       70   80
 *               /
 *              44
 *     At any node if Math.abs(Left_Height - right_height) > 1 then it is balanced
 * 
 */
package LA05_BalancedBinaryTree;
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
    static int isBalancedBinaryTree(Tree node)
    {
        if(node==null)
        {
            return 0;
        }
        int lh=isBalancedBinaryTree(node.left);
        if(lh==-1) return -1;
        int rh=isBalancedBinaryTree(node.right);
        if(rh==-1) return -1;
        if(Math.abs(lh-rh)>1) return -1;
        else
            return Math.max(lh, rh)+1;
    }
    public static void main(String args[])
    {
       Scanner obj=new Scanner(System.in);
       root=new Tree(20);
       root.left=new Tree(12);
       root.right=new Tree(8);
       root.left.left=new Tree(8);
       root.left.right=new Tree(78);
       root.right.left=new Tree(87);
       root.right.right=new Tree(88);
//       root.left.right=new Tree(4);
//       root.right.left=new Tree(80);
//       root.right.right=new Tree(30);
//       root.right.right.left=new Tree(60);  
//       root.right.right.right=new Tree(110);
         int result=isBalancedBinaryTree(root);
         if (result==-1)
                 {
                   System.out.println("Unbalanced");
                 }
         else 
         {
             System.out.println("Balanced and Height="+result);
         }
    }
     
    
}
