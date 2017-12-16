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
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(root==null){
            return ans;
        }
        if(root.val<k1){
            ans.addAll(searchRange(root.right,k1,k2));
        }else if(root.val==k1){
            ans.add(root.val);
            ans.addAll(searchRange(root.right,k1,k2));
        }else if(root.val>k1&&root.val<k2){
            ans.addAll(searchRange(root.left,k1,k2));
            ans.add(root.val);
            ans.addAll(searchRange(root.right,k1,k2));
        }else if(root.val==k2){
            ans.addAll(searchRange(root.left,k1,k2));
            ans.add(root.val);
        }else if(root.val>k2){
            ans.addAll(searchRange(root.left,k1,k2));
        }
        return ans;
    }
}
