/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
 
import java.util.*;
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
        
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        if(root==null){
            return ans;
        }
        q.add(root);
        int tobeprint=1;
        int nextlevel=0;
        while(!q.isEmpty()){
            ArrayList<Integer> temparr=new ArrayList<Integer>();
            while(tobeprint-->0){
                temparr.add(q.peek().val);
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                    nextlevel++;
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                    nextlevel++;
                }
                q.remove();
            }
            ans.add(temparr);
            tobeprint=nextlevel;
            nextlevel=0;
        }
        return ans;
    }
}
