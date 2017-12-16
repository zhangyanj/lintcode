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
     * @param root: A Tree
     * @return: Postorder in ArrayList which contains node values.
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        return work(root);
    }
    
    public List<Integer> work(TreeNode root){
        List<Integer> temp1 = new ArrayList<Integer>();
        List<Integer> temp2 = new ArrayList<Integer>();
        if(root == null){
            return temp1;
        }
        temp1 = work(root.left);
        temp2 = work(root.right);
        for(int i = 0; i<temp2.size(); i++){
            temp1.add(temp2.get(i));
        }
        temp1.add(root.val);
        return temp1;
    }
}
