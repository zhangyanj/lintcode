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
    /*
     * @param root: The root of the binary search tree.
     * @param A: A TreeNode in a Binary.
     * @param B: A TreeNode in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
        return isHasAOrB(root,A,B);
    }
    
    public TreeNode isHasAOrB(TreeNode root, TreeNode A, TreeNode B){
        if(root == null){
            return null;
        }
        if(root == A||root == B){
            return root;
        }
        TreeNode left = isHasAOrB(root.left,A,B);
        TreeNode right = isHasAOrB(root.right,A,B);
        if(left != null&&right != null){
            return root;
        }
        if(left != null){
            return left;
        }
        if(right != null){
            return right;
        }
        return null;
    }
    

}
