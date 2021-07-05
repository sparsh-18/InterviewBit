public class Solution2 {
   public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        
        boolean firstRow = false, firstCol = false;

        for (int i=0; i<a.size(); i++) {
            if(a.get(i).get(0) == 0){
                firstCol = true;
                break;
            }
        }

        for (int i=0; i<a.get(0).size(); i++) {
            if(a.get(0).get(i) == 0){
                firstRow = true;
                break;
            }
        }

        for (int i=1; i<a.size(); i++) {
            for (int j = 1; j<a.get(i).size(); j++) {
                if(a.get(i).get(j) == 0) {
                    a.get(0).set(j,0);
                    a.get(i).set(0,0);
                }
            }
        }

        for (int i=1; i<a.size(); i++) {
            if(a.get(i).get(0) == 0){
                setRowZero(a, i);
            }
        }

        for(int i=1; i<a.get(0).size(); i++) {
            if(a.get(0).get(i) == 0) {
                setColZero(a,i);
            }
        }

        if(firstRow) 
            setRowZero(a,0);
        if(firstCol)
            setColZero(a,0);
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
