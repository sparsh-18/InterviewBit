public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        if(A.size()==0) return -1;

        int min=Integer.MAX_VALUE, res=0;

        Collections.sort(A, new mysort());

        for(int i=0;i<A.size()-2;i++) {
            int r = A.size()-1;
            int l=i+1;

            while(l<r) {
                int ans = A.get(i)+A.get(r)+A.get(l);
                
                if(Math.abs(ans-B) < min) {
                    min = Math.abs(ans-B);
                    res=ans;
                }

                if(ans == B) return B;
                
                else if(ans < B) l++;
                
                else r--;
            }
        }

        return res;
    }

    class mysort implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return a-b;
        }
    }
}
