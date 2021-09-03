public class Solution {
	public ArrayList<ArrayList<String>> solveNQueens(int A) {
		 ArrayList<ArrayList<String>> ans = new ArrayList<>();
        
        boolean left[] = new boolean[2*A], right[] = new boolean[2*A], col[] = new boolean[A];
        int comb[] = new int[A];
        
        nqueen(A,ans, left, right, col, comb, 0);
        
        return ans;
	}

	public void nqueen(int A, ArrayList<ArrayList<String>> ans, boolean left[], boolean right[], boolean col[], int comb[], int r) {
        if(r==A) {
            ArrayList<String> answer = new ArrayList<>();
            for(int i=0;i<comb.length;i++){
                 StringBuffer l = new StringBuffer(A);
                 for(int j=0;j<A;j++) l.append(".");
                 int colno = comb[i] - 1;
                 l.setCharAt(colno, 'Q');
                // l.append(",");
                 
                 //System.out.println(comb.length);
                 
                 answer.add(l.toString());
            }
            ans.add(answer);
        }
        
        for(int i=0;i<A;i++)
        {
            if(!col[i] && !left[r+i] && !right[r-i+A]) {
                comb[r] = i+1;
                col[i] = left[r+i] = right[r-i+A] = true;
                nqueen(A, ans, left, right,col, comb, r+1);
                col[i] = left[r+i] = right[r-i+A] = false;
                comb[r]=0;
            }
        }
    }
    
}
