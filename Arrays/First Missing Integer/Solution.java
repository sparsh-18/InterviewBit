public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        for(int i=0; i<A.size(); i++) {
            if(A.get(i) < 0) {
                A.remove(i);
            }
        }

        for(int i=0;i<A.size(); i++) {
            int x = Math.abs(A.get(i));

            if(x-1 < A.size() && x-1 >=0 && A.get(x-1)>0) {
                A.set(x-1, -1*A.get(x-1));
            }
        }
        int i=0;
        for(i=0;i<A.size();i++) {
            if(A.get(i) > 0){
                return i+1;
            }
        }
        return i+1;
    }
}
