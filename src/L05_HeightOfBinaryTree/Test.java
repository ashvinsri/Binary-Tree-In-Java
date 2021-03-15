/**
 *     
 *   Write a program to find the height of Binary Tree.
 *               10
 *           /        \   
 *          20        30
 *        /   \         \
 *       40   50        60
 *              \
 *              70
 *              /
 *             80
 *   height = Math.max(height of left subtree , height of right subtree) +1
 *   i) - Go to left Subtree
 *  ii) - Go to right subtree
 * iii) - Calculate height+1
 */
package L05_HeightOfBinaryTree;
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
    static int heightOfBinaryTree(Tree node)
    {
        if(node==null)
        {
            return 0;
        }
        return Math.max(heightOfBinaryTree(node.left),heightOfBinaryTree(node.right))+1;
    }
    public static void main(String args[])
    {
       root=new Tree(10);
       root.left=new Tree(20);
       root.left.left=new Tree(40);
       root.left.right=new Tree(50);
       root.left.right.right=new Tree(70);
       root.left.right.right.left=new Tree(80);
       root.right=new Tree(30);
       root.right.right=new Tree(60);   
    
       int height=heightOfBinaryTree(root);
       System.out.println(height);
    }
}