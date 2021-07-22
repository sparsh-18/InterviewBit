public class Solution {
	public int removeDuplicates(ArrayList<Integer> A) {
        int i=0,c=0,j=1;

        while(j<A.size() && i < A.size()) {
            c++;
            int ii=A.get(i),jj=A.get(j);
            if(A.get(i).equals(A.get(j))) {
                // A.remove(j);
                // continue;
                while(j<A.size() && A.get(j) == jj){
                    j++;
                }
                
            }
           if(j==A.size()) A.set(c,A.get(j-1)); else A.set(c,A.get(j));
            i=j;
            j++;  
            // else {
            //     i=j;
            //     j++;
            // }
        }
        return i==A.size() ? c : c+1;
       // return A.size();
	}
}
