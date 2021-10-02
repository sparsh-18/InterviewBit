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
    public ArrayList<Integer> solve(TreeNode A, int B) {
        Stack<Integer> st = new Stack<>();

        if(solve(st, A, B)) return new ArrayList(st);
        else return new ArrayList<Integer>();
    }

    public boolean solve(Stack<Integer> st, TreeNode A, int B) {
        if(A==null) return false;
        
        st.push(A.val);

        if(A.val == B) return true;

        boolean left = solve(st, A.left, B);
        boolean right = solve(st, A.right, B);

        if(!left && !right) {
            st.pop();
            return false;
        }
        else return true;
    }
}
