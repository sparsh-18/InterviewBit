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
    public int t2Sum(TreeNode A, int B) {
        Stack<TreeNode> s1 = new Stack<>(), s2 = new Stack<>();

        boolean isstart = false, isend = false;
        TreeNode s = A, e = A;
        int x=-1,y=-1;

        while(true) {
            
            while(!isstart) {
                if(s!=null) {
                    s1.push(s);
                    s=s.left;
                }
                else {
                    if(s1.isEmpty()) isstart=true;
                    s=s1.peek();
                    s1.pop();
                    x=s.val;
                    s=s.right;
                    isstart=true;
                }
            }

            while(!isend) {
                if(e!=null) {
                    s2.push(e);
                    e=e.right;
                }
                else {
                    if(s2.isEmpty()) isend = true;
                    e=s2.peek();
                    s2.pop();
                    y=e.val;
                    e=e.left;
                    isend=true;
                }
            }

            if((x!=y)&&(x+y == B)) return 1;
            else if(x+y>B) isend=false;
            else if(x+y<B) isstart=false;
            if(x>=y) break;
        } 
        return 0;
    }
}
