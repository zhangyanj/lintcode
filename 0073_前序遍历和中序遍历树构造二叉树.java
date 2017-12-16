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
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,inorder,0,preorder.length-1,0,inorder.length-1,map);
    }
    public TreeNode build(int[] preorder,int[] inorder,int prestart,int preend,int instart,int inend,HashMap<Integer,Integer> map){
        if(prestart>preend||instart>inend){
            return null;
        }
        if(prestart==preend||instart==inend){
            return new TreeNode(preorder[prestart]);
        }
        int t=preorder[prestart];
        int k=map.get(t);
        TreeNode temp=new TreeNode(t);
        int leftlen=k-instart;
        int rightlen=inend-k;
        temp.left=build(preorder,inorder,prestart+1,prestart+leftlen,instart,k-1,map);
        temp.right=build(preorder,inorder,prestart+leftlen+1,preend,k+1,inend,map);
        return temp;
    }
}
