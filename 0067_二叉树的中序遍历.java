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
     * @return: Inorder in ArrayList which contains node values.
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(root == null){
            return ans;
        }else{
            return work(root);
        }
    }
    
    public List<Integer> work(TreeNode root){
        List<Integer> ret = new ArrayList<Integer>();
        if(root.left==null){
            ret.add(root.val);
            if(root.right!=null){
                List<Integer> temp1 = work(root.right);
                for(int i = 0;i < temp1.size(); i++){
                    ret.add(temp1.get(i));
                }
            }
        }else if(root.right==null){
            List<Integer> temp1 = work(root.left);
            temp1.add(root.val);
            ret = temp1;
        }else{
            List<Integer> temp1 = work(root.left);
            temp1.add(root.val);
            List<Integer> temp2 = work(root.right);
            for(int i = 0;i < temp2.size(); i++){
                temp1.add(temp2.get(i));
            }
            ret = temp1;
        }
        return ret;
    }
}
