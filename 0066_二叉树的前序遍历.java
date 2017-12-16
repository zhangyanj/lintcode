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
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(root==null){
            
        }
        
        pt(root,ans);
        return ans;
        
    }
    public void pt(TreeNode root,ArrayList<Integer> an){
        if(root==null){
            return;
        }
        an.add(root.val);
        pt(root.left,an);
        pt(root.right,an);
    }
}
