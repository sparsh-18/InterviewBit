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
    public TreeNode solve(TreeNode A, TreeNode B) {
        
        if(A==null && B==null) return null;
        if(B==null) return A;
        if(A==null) return B;
       // A.left=solve(A.left,B.left);
        if(A!=null && B!=null){
            A.val = A.val+B.val;
          //  return A;
        }
        A.left = solve(A.left,B.left);
        A.right = solve(A.right,B.right);
        return A;
    }
}
