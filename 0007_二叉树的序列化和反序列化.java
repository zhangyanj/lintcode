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
class Solution {
    /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        if( root == null)
            return "{}";
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        queue.add(root);
        // 将二叉树的个节点按照从上到下、从左到有的存储在queue中
        for(int i=0;i<queue.size();i++){
            TreeNode q = queue.get(i);
            if(q== null)
                continue;
            queue.add(q.left);
            queue.add(q.right);
        }
        // 去除叶子节点的左右孩子，这个孩子是空值
        while(queue.get(queue.size() - 1) == null){
            queue.remove(queue.size() - 1);
        }
        // 遍历queue把转换成字符串
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(queue.get(0).val);
        for(int i=1;i<queue.size(); i++){
            TreeNode q = queue.get(i);
            if(q!= null){
                sb.append(",");
                sb.append(q.val);
            }else{
                sb.append(",#");
            }
        }
        sb.append("}");
        return sb.toString();
    }
    
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it‘s given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
        if(data == "{}")
            return null;
        // 以逗号分割
        String[] vals = data.substring(1,data.length()-1).split(",");
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        // 根节点 
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        queue.add(root);
        int index = 0;
        boolean isLeftChild = true;
        for (int i = 1; i < vals.length; i++) {
            if (!vals[i].equals("#")) {
                TreeNode node = new TreeNode(Integer.parseInt(vals[i]));
                if (isLeftChild) {
                    queue.get(index).left = node;
                } else {
                    queue.get(index).right = node;
                }
                queue.add(node);
            }
            if (!isLeftChild) {
                index++;
            }
            isLeftChild = !isLeftChild;
        }
        return root;
    }
}
