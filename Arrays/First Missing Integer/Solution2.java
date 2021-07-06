public class Solution2 {
    public int firstMissingPositive(ArrayList<Integer> A) {
        for(int i=0;i<A.size();i++) {
            while(A.get(i)!=i+1) {
                int n =A.get(i);
                if(n-1 >= 0 && n-1<A.size() && A.get(n-1)!=n) { //last condition for 1 1 1 case
                    swap(A, i, n-1);
                }
                else
                    break;
            }
        }

        for(int i=0;i<A.size();i++){
            if(A.get(i) != i+1)
                return i+1;
        }
        return A.size()+1;
    }

    public void swap(ArrayList<Integer> A, int i, int j) {
        int r = A.get(i);
        A.set(i, A.get(j));
        A.set(j, r);
    }
}
