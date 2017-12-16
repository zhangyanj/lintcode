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
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
        int[] ans=main(root);
        if(ans[2]==1){
            return true;
        }
        return false;
    }
    public int[] main(TreeNode root){
        int[] an=new int[3];
        if(root==null){
            an[0]=Integer.MAX_VALUE;
            an[1]=Integer.MIN_VALUE;
            an[2]=1;
            return an;
        }
        int[] anleft;
        int[] anright;
        anleft=main(root.left);
        anright=main(root.right);
        an[0]=Math.min(anleft[0],Math.min(anright[0],root.val));
        an[1]=Math.max(anleft[1],Math.max(anright[1],root.val));
        if(root.val==Integer.MAX_VALUE||root.val==Integer.MIN_VALUE){
            if(root.val>=anleft[1]&&root.val<=anright[0]&&anleft[2]==1&&anright[2]==1){
                an[2]=1;
            }else{
                an[2]=0;
            }
        }else{
            if(root.val>anleft[1]&&root.val<anright[0]&&anleft[2]==1&&anright[2]==1){
                an[2]=1;
            }else{
                an[2]=0;
            }
        }

        return an;
    }
}
