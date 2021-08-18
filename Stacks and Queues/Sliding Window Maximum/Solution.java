public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (k==1){ 
            ans.addAll(A);
            return ans;
        }

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0; i < A.size(); i++) {
            if(!dq.isEmpty() && (i-k) == dq.peek())
                dq.poll();
            
            while(!dq.isEmpty() && A.get(i) > A.get(dq.peekLast()))
                dq.pollLast();
            
            dq.add(i);

            if(i>=k-1) ans.add(A.get(dq.peek()));
        }

        return ans;
    }
}
