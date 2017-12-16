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
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        boolean[] isthat=new boolean[1];
        isthat[0]=true;
        getdepth(root,isthat,1);
        return isthat[0];
        
    }
    
    public int getdepth(TreeNode root,boolean[] isbalance,int level){
        if(root==null){
            return level;
        }
        int leftdepth=getdepth(root.left,isbalance,level+1);
        int rightdepth=getdepth(root.right,isbalance,level+1);
        if(Math.abs(leftdepth-rightdepth)>1){
            isbalance[0]=false;
        }
        return Math.max(leftdepth,rightdepth);
    }
}
