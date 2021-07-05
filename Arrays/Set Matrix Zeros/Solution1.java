public class Solution1 {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        boolean row[] = new boolean[a.size()];
        boolean col[] = new boolean[a.get(0).size()];

        for (int i=0; i<a.size(); i++) {
            for (int j = 0; j<a.get(i).size(); j++) {
                if(a.get(i).get(j) == 0) {
                    row[i] = true;
                    col[j]=true;
                }
            }
        }

        for(int i=0; i<a.size(); i++) {
            if(row[i])
                setRowZero(a,i);
        }

        for(int j = 0; j<a.get(0).size(); j++){
            if(col[j])
                setColZero(a,j);
        }
	}

    public void setRowZero(ArrayList<ArrayList<Integer>> a, int i) {
        for (int j=0;j<a.get(i).size();j++) {
            a.get(i).set(j,0);
        }
    }

    public void setColZero(ArrayList<ArrayList<Integer>> a, int j) {
        for (int i=0;i<a.size();i++) {
            a.get(i).set(j,0);
        }
    }
}
