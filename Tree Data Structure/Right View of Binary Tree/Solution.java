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

    public ArrayList<Integer> solve(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();

        solve(ans, A, 1);

        return ans;
    }

    public void solve(ArrayList<Integer> ans, TreeNode root, int level) {
        if(root == null) return;

        if(ans.size() < level) {
            ans.add(root.val);
        }

        solve(ans, root.right, level+1);
        solve(ans, root.left, level+1);
    }
}
