public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        Stack<Integer> s = new Stack<>();
        int ans=0;
        for(int i=0;i < A.size(); i++) {
            while(!s.empty() && A.get(i) > A.get(s.peek())) {
                int ph = A.get(s.peek());
                s.pop();
                
                if(s.empty()) break;

                int dis = i - s.peek() - 1;

                int leftBorder = Math.min(A.get(s.peek()) , A.get(i)) - ph;

                ans += leftBorder*dis;
            }
            s.push(i);
        }

        return ans;
    }
}
