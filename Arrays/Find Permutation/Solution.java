public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
       ArrayList<Integer> ar = new ArrayList<>();

        for(int i = 0; i<= B-1; i++)
            ar.add(-1);
        
        int min =1, max=B;

        for(int i = 0; i <= B-2; i++){
            if(A.charAt(i) == 'I'){
                ar.set(i,min++);
            }
            else
                ar.set(i,max--);
        }

        ar.set(B-1, max);

        return ar;
    }
}
