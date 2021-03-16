/**
 *    
 *                    10   
 *               /          \
 *              20          30
 *            /   \           \
 *           40   50          60
 *                  \         /
 *                  70      110
 *                 /
 *                80
 * Output-
 *          10  20  40  70  80
 * 
 */
package LA02_LeftViewOfBinaryTree;
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
    static void leftViewBinaryTree(Tree node)
    {
        Queue<Tree> q = new LinkedList<Tree>();
        if(node==null)
            return;
        q.add(root);
        while(!q.isEmpty())
        {
            int count=q.size();
            for(int i=0;i<count;i++)
            {
                Tree temp=q.peek();
                q.poll();
                if(i==0)
                {
                    System.out.print(temp.data+" ");
                }
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                    q.add(temp.right);
            }
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
       leftViewBinaryTree(root);
    }
}
