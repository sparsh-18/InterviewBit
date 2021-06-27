public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n = a.size();

        for(int i = n-1; i>=n/2; i--) {
            int k = n-1-i;
            for (int j = k; j<=i-1; j++) {
                int t = a.get(j).get(k);

                a.get(j).set(k,a.get(i).get(j));
                a.get(i).set(j,a.get(n-j-1).get(i));
                a.get(n-1-j).set(i, a.get(k).get(n-j-1));
                a.get(k).set(n-1-j, t);

            }
        }
	}
}
