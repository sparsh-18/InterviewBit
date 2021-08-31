public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        Collections.sort(A);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        subsetsWithDup(A, ans, st, 0);

        return ans;
    }

    public void subsetsWithDup(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> ans, Stack<Integer> st, int x) {
        ans.add(new ArrayList(st));

        for(int i=x;i<A.size();i++) {
            if(i>x && A.get(i)==A.get(i-1)) continue;
            st.push(A.get(i));
            subsetsWithDup(A, ans, st, i+1);
            st.pop();
        }
    }
}
