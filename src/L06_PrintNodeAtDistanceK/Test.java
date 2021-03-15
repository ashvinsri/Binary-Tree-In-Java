/**
 *   Write a program to find the height of Binary Tree.
 *               10
 *           /        \   
 *          20        30
 *        /   \         \
 *       40   50        60
 *              \      /
 *              70    30
 *              /
 *             80
 *   Suppose k=2 so O/p= [ 20,30]
 *   
 * 
 * 
 */
package L06_PrintNodeAtDistanceK;
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
    static void nodesAtDistanceK(Tree node,int k)
    {
        if(node==null)
        {
            return;
        }
        if(k==0)
        {
            System.out.println(node.data);
        }
        nodesAtDistanceK(node.left,k-1);
        nodesAtDistanceK(node.right,k-1);
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
       int k = obj.nextInt();
       nodesAtDistanceK(root,k);
    }
}
