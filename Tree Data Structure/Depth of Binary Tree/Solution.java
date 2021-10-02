/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode A) {
        if(A==null) return 0;

        int l=maxDepth(A.left);
        int r=maxDepth(A.right);
        
        return Math.max(l,r)+1;
    }
}
