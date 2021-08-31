/*
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int i=0,c=0,j=0,max=-1;
        for(j=0;j<A.size();j++) {
           
            if(A.get(j) == 0)
                c++;
            
            if(c<=B) {
                if((j-i+1) > max) max = j-i+1;
            }
           
            while(c>B) {        
                if(A.get(i)==0) c--;
                i++;
            }   
            
        } 
        return max;
    }
}
*/

//on revision
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int i=0, max=0, zeroC = 0;

        for(int j=0;j<A.size();j++) {
            if(A.get(j) == 0) zeroC++;

            while(zeroC > B) {
                if(A.get(i) == 0) zeroC--;
                i++;
            }

            max = Math.max(max, j+1-i);
        }

        return max;
    }
}
