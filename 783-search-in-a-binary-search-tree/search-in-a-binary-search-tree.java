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
    public TreeNode searchBST(TreeNode root, int val) {
        //base case
        if(root == null){
            return null;
        }

        if(val > root.val){//if the value is greater then root.val.
            return searchBST(root.right , val);//we search the right side.
        }else if(val < root.val){//if the value is smaller then root.val.
            return searchBST(root.left , val);//we search the left side.
        }else{
            return root;//return the root.
        }
    }
}