/**
 * 
 *   Tree :- Tree is the non-linear data structure. Basically we discuss about the Binary Tree.                                10
 *   Tree is used when we show the hierarchical structure                                                              20              30
 *   Parent:- Node which is just above the given node is called Parent Node                                      40          5     8          80   
 *   Child:- Nodes which are just below the particular Node                                                                     70    9
 *   Subtree:- Subtree is the part of the Tree
 *   Descendant:- All Nodes lies in the subtree with this node as the root node
 *   Degree:- Number of Children a node have
 * 
 * 
 * 
 */
package L01_Introduction;
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
    public static void main(String args[])
    {
       root=new Tree(10);
       root.left=new Tree(20);
       root.left.left=new Tree(40);
       root.left.right=new Tree(50);
       root.right=new Tree(30);
       root.right.right=new Tree(60);    
    }
}
