public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);

        for(int i=0;i<=A.size()-1;i+=2) {
		    if(i+1 < A.size()) {
		        int t = A.get(i);
    		    A.set(i,A.get(i+1));
    		    A.set(i+1,t);    
		    }
		    
		}

        return A;
    }
}
