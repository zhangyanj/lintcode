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
     * @param root: A tree
     * @return: buttom-up level order a list of lists of integer
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
        if(root == null){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> ans = work(levelOrderBottom(root.left),levelOrderBottom(root.right));
        List<Integer> rootval = new ArrayList<Integer>();
        rootval.add(root.val);
        ans.add(rootval);
        return ans;
    }
    
    public List<List<Integer>> work(List<List<Integer>> left,List<List<Integer>>right){
        if(left.size() == 0){
            return right;
        }
        if(right.size() == 0){
            return left;
        }
        int len = Math.max(right.size(),left.size());
        int count = 1;
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i =0 ;i<len;i++){
            ans.add(i,new ArrayList<Integer>());
        }
        while(count<=len){
            List<Integer> lv = left.size() == 0?new ArrayList<Integer>():left.remove(left.size()-1);
            List<Integer> rv = right.size() == 0?new ArrayList<Integer>():right.remove(right.size()-1);
            ans.remove(len-count);
            ans.add(len-count,miniwork(lv,rv));
            count++;
        }
        return ans;
    }
    public List<Integer> miniwork(List<Integer> left,List<Integer> right){
        if(left.size() == 0){
            return right;
        }
        if(right.size() == 0){
            return left;
        }
        int len = right.size();
        int count = 0;
        while(count<len){
            left.add(right.get(count));
            count++;
        }
        return left;
    }
}
