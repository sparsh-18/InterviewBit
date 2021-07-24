public class Solution {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
        int i=0,j=0,m=-1,bl=0,br=0,c=0;

        for(j=0;j<A.size();j++){
            if(A.get(j)==0) c++;

            if(c<=B && (j-i+1)>m){
                m=j-i+1;
                bl=i;
                br=j;
            }

            while(c>B){
                if(A.get(i)==0)
                  c--;
                i++;
            }
        }
        ArrayList<Integer> ar=new ArrayList<>();
        for(int x=bl;x<=br;x++)
          ar.add(x);
        
        return ar;
    }
}
