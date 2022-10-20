/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        find(root);
        return res;
    }
    
    public int find(TreeNode root){
        if(root==null){
            return 0;
        }
         int l= Math.max(find(root.left), 0);
        int r = Math.max(find(root.right), 0);
        int temp=Math.max(l,r)+root.val;
        if(root.left==null&&root.right==null){
            temp=Math.max(temp,root.val);
        }
        int ans=Math.max(temp,root.val+l+r);
        res=Math.max(res,ans);
        
        return temp;
    }
}