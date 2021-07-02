public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {

        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
		
		for(int i=0;i<A;i++)
		    ar.add(new ArrayList<>());
		
		for(int i=0;i<A;i++) {
			for(int j=0;j<=i;j++) {
				ar.get(i).add(0);
			}
			ar.get(i).set(0,1);
			ar.get(i).set(i,1);

			for (int j=1;j<i;j++) {
				int c = ar.get(i-1).get(j-1) + ar.get(i-1).get(j);
				ar.get(i).set(j,c);
			}
		}	
		return ar;
    }
}
