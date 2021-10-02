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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        Stack<TreeNode> st=new Stack<>();
        ArrayList<Integer> ans=new ArrayList<>();

  /*      TreeNode t=A;
        while(t!=null){
            st.push(t);
            t=t.left;
        }

        while(!st.isEmpty()){
            t=st.peek();
            st.pop();
            ans.add(t.val);

            if(t.right!=null) {
                st.push(t.right);
                TreeNode n= t.right.left;
                while(n!=null){
                    st.push(n);
                    n=n.left;
                }
            }
        } */

        while(!st.isEmpty() || A!=null){
            if(A!=null){
                st.push(A);
                A=A.left;
            }
            else{
                TreeNode t=st.peek();
                st.pop();
                ans.add(t.val);
                if(t.right!=null){
                    A=t.right;
                }
            }
        }

        return ans;
    }
}
